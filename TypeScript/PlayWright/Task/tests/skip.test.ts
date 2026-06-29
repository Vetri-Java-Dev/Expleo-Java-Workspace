import { test, expect } from '@playwright/test';

test("login - 1 @ValidLogin @Default",async({page})=>{

    await page.goto("https://www.demoblaze.com/")

    await page.click("//a[@id='login2']")

    await page.fill("#loginusername","admin")
    await page.fill("#loginpassword","admin")

    await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")

    //soft assertion
    await expect.soft(page.locator("//a[@id='logout2']").textContent(),"Log Out")
    await expect.soft(page.locator("//a[@id='logout2']")).toBeVisible()

    await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")

})

test.skip("login - 2 @Skip",async({page})=>{

    test.skip(true,"Test under maintanence")

    await page.goto("https://www.demoblaze.com/")

    await page.click("//a[@id='login2']")

    await page.fill("//a[@id='login2']","admin")
    await page.fill("//a[@id='login2']","admin")

    await page.click("//a[@id='login2']")

    //soft assertion
    await expect.soft(page.locator("//a[@id='logout2']").textContent(),"Log Out")
    await expect.soft(page.locator("//a[@id='logout2']")).toBeVisible()

    await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")

})


test("login - 3 ",async({page})=>{

    await page.goto("https://www.demoblaze.com/")

    await page.click("//a[@id='login2']")

    await page.fill("#loginusername","admin")
    await page.fill("#loginpassword","admin")

    await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")

    //soft assertion
    await expect.soft(page.locator("//a[@id='logout3']").textContent(),"Log Out")
    await expect.soft(page.locator("//a[@id='logout3']")).toBeVisible()

    await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")

})

test.afterEach("Resource closing",async({page,},testInfo)=>{
    console.log("Test title : ",testInfo.title)
    console.log("Test retry count : ",testInfo.retry)
    console.log("Test Status : ",testInfo.status)
    console.log("Duration : ",testInfo.duration)
})