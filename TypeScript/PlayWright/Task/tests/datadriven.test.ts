import {test, expect} from '@playwright/test'
import * as XLSX from 'xlsx'


const workbook=XLSX.readFile("./data/login_data.xlsx")
const sheet=workbook.Sheets["ValidLoginData"]

const testData:any=XLSX.utils.sheet_to_json(sheet)

test.describe("Login", () => {
    
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
            await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
            
            expect(await page.title()).toContain('STORE');
            expect(page.url()).toContain('https://demoblaze.com/');
        })
    }
})