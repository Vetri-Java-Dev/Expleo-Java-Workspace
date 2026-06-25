import { chromium,test,expect } from "@playwright/test";

test("Login DemoBlaze",async()=>{
    const browser=await chromium.launch({headless:false});

    const context=await browser.newContext();

    const page=await context.newPage();

    // goto
    await page.goto("https://www.google.com/?zx=1782371458858");

    await page.waitForTimeout(5000)

    await page.goto("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=813766258796&hvpos=&hvnetw=g&hvrand=7043154796242334513&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-64107830&hydadcr=14452_2461880&gad_source=1");

    await page.waitForTimeout(5000)

    console.log(await page.title())

    await page.goBack()

    console.log(await page.title())

    await page.goForward()

    console.log(await page.title())
});