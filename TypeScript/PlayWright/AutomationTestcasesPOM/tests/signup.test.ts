import {test, expect} from "../fixtures/baseFixture"

import {readRegisterData, RegisterData} from "../utility/csvreader"

const validUsers=readRegisterData().find(user=>user.type==="valid")

test.describe("Register account",async()=>{

    test.beforeEach(async({homePage})=>{
        await homePage.navigateToHome()
    })

    test("Registeration using valid credentials",async({signupPage, homePage})=>{

        await homePage.signupLogin.click()

        await signupPage.fillDetails(validUsers!.name,validUsers!.email)

        await signupPage.signUp(
            validUsers!.password,
            validUsers!.firstName,
            validUsers!.lastName,
            validUsers!.address,
            validUsers!.state,
            validUsers!.city,
            validUsers!.zipcode,
            validUsers!.mobile
        );

        await expect(signupPage.isAccountCreated())
    })
})