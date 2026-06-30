import {test, expect} from "../fixtures/baseFixtures"

import loginData from "../test-data/loginData.json"

test.describe("Login Test @LoginGroup",async()=>{

    test.beforeEach(async({loginPage})=>{
        await loginPage.navigate()
    })

    test("Invalid Login Test @InvalidLogin",async({loginPage})=>{

        await loginPage.login(loginData["Invalid Login"].username,loginData["Invalid Login"].password)

        await expect(loginPage.errorMessage).toBeVisible()

    })

    test("Valid Login Test @ValidLogin",async({loginPage,dashboardPage})=>{

        await loginPage.login(loginData["Valid Login"].username,loginData["Valid Login"].password)

        await expect(dashboardPage.dashboardTitle).toBeVisible()

    })
    
})