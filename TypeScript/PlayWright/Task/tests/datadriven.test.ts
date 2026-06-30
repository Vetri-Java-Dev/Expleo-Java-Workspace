import { JSON2SheetOpts } from './../node_modules/xlsx/types/index.d';
import {test, expect} from '@playwright/test'
import * as XLSX from 'xlsx'
import loginData from "../test-data/loginData.json";


const workbook=XLSX.readFile("./data/login_data.xlsx")
const sheet=workbook.Sheets["ValidLoginData"]

const testData:any=XLSX.utils.sheet_to_json(sheet)

test.describe("Login",()=>{

    for(const {username, password} of testData) {
        test(`Login Test with username: ${username} and password: ${password}  @login`, async ({page}) => {
            
            await page.goto('https://demoblaze.com/');
            await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();

            await page.getByRole('link', { name: 'Log in' }).click();
            await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();

            await page.locator('#loginusername').fill(username);
            await page.locator('#loginpassword').fill(password);

            await page.getByRole('button', { name: 'Log in' }).click();

            await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible({timeout: 100000});
            await expect(page.locator('#nameofuser')).toContainText('Welcome ');

            expect(await page.title()).toContain('STORE');
            expect(page.url()).toContain('https://demoblaze.com/');

        })
    }
})

interface LoginData{
    username : string,
    password : string,
    expectedMessage : string,
    expectedResult : string
}

const jsonData=loginData as LoginData[]

test.describe("Login using json test data",()=>{

    for(const data of jsonData) {
        test(`Login Test with username: ${data.username} and password: ${data.password}  @login`, async ({page}) => {
            
            await page.goto('https://demoblaze.com/');
            await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();

            await page.click("//a[@id='login2']")
            
            await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();

            await page.locator('#loginusername').fill(data.username);
            await page.locator('#loginpassword').fill(data.password);

            console.log(data)

            if(data.expectedResult==="Failure"){
                page.once("dialog",async dialog=>{
                    await expect(dialog.message()).toBe(data.expectedMessage)
                })
                await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")
            }
            
            else{
                await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")

                await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible({timeout: 10000});
                await expect(page.locator('#nameofuser')).toContainText(`Welcome ${data.username}`);

                expect(await page.title()).toContain('STORE');
                expect(page.url()).toContain('https://demoblaze.com/');
            }

        })
    }
})