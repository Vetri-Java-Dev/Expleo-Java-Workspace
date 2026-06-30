import {test, expect} from "../fixtures/baseFixtures"

import loginData from "../test-data/loginData.json"

test.describe("Logout Test",async()=>{

    test.beforeEach(async({loginPage})=>{
        await loginPage.navigate()
        await loginPage.login(loginData['Valid Login'].username,loginData['Valid Login'].password)
    })

    test("Log out Test @Logout",async({dashboardPage,loginPage})=>{
        await dashboardPage.Logout()
        await expect(loginPage.loginTitle).toBeVisible()
    })

})