import { test, expect } from '@playwright/test';

test.describe("Authentication",{
    tag:"@Logins"
},()=>{

    test("login - 1 ",async({page})=>{

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


    test("login - 3 ",async({page})=>{

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

    test("login - 2 ",async({page})=>{

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
})