import { chromium,test,expect } from "@playwright/test";

test("Login DemoBlaze",async()=>{
    const browser=await chromium.launch({headless:false});

    const context=await browser.newContext();

    const page=await context.newPage();

    await page.goto("https://www.demoblaze.com/index.html");

    await page.click("//a[@id='login2']");

    await page.fill("//*[@id='loginusername']","admin");
    await page.fill("//*[@id='loginpassword']","admin");

    await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]");
    
    await page.waitForTimeout(6000);
    await expect(page.locator("//a[@id='logout2']")).toBeVisible()
    

    const newPage=await context.newPage();
    
    page.goto("https://www.demoblaze.com/cart.html")

    await page.waitForTimeout(6000);
    await expect(page.locator("//a[@id='logout2']")).toBeVisible()


});