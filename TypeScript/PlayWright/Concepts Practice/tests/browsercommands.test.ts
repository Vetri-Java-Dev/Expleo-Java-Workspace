import { chromium,test,expect } from "@playwright/test";

test("Login DemoBlaze",async()=>{
    const browser=await chromium.launch({headless:false});

    const context=await browser.newContext();

    const page=await context.newPage();

    // goto
    await page.goto("https://www.demoblaze.com/index.html");

    // 1.title
    const title=await page.title()
    console.log(title)

    // 2.Current url
    const url=await page.url()
    console.log(url)

    // 3.page source
    const source=await page.content()
    console.log(source)

    // 4.page close
    page.close()

    // 5.browser quit
    browser.close()


});