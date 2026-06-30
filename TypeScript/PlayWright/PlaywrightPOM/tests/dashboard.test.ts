import {test, expect} from "../fixtures/baseFixtures"

import loginData from "../test-data/loginData.json"

test.describe("Dashboard Test @DashboardTest",async()=>{

    test.beforeEach(async({loginPage})=>{
        await loginPage.navigate()
        await loginPage.login(loginData['Valid Login'].username,loginData['Valid Login'].password)
    })

    test("Quick launch visible test @Quicklaunch",async({dashboardPage})=>{
        await expect(dashboardPage.quickLaunch).toBeVisible()
    })

    test("Time at work test @TimeAtWork",async({dashboardPage})=>{
        await expect(dashboardPage.timeAtWorkCard).toBeVisible()
    })

    test.afterEach(async({dashboardPage})=>{
        await dashboardPage.Logout();
    })

})