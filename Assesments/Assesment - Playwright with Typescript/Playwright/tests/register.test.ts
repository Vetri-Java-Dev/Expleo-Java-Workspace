import { test, expect } from "../fixtures/baseFixtures";
import {RegisterationData, readRegisterData} from "../utility/csvReader"
import {createUser} from "../factory/userFactory"

const users=readRegisterData()

const validUsers=users.find(user=>user.type=="valid")
const invalidUsers=users.find(user=>user.type=="invalid")

test.describe("Register test @Smoke",()=> {

    test.beforeEach(async({page})=>{
        await page.goto("https://tutorialsninja.com/demo",{
            waitUntil:"networkidle"
        })
    })

    test("Valid Registration", async ({homePage,registerPage})=>{

        const user=createUser();

        await homePage.clickMyAccountMenu()
        await homePage.clickRegister()

         await registerPage.register(user.firstName,user.lastName,user.email,
            user.mobile,user.password,user.confirmationPassword);

        await expect(registerPage.isAccountCreated())
    });

});