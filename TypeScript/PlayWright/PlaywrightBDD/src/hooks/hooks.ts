import { chromium } from "@playwright/test";
import { Before, After, Status } from "@cucumber/cucumber";

Before(async function () {
    this.browser=await chromium.launch({ headless: false });
    this.context=await this.browser.newContext();
    this.page=await this.context.newPage();
});

After(async function ({pickle,result}) {

    if(result?.status==Status.FAILED){
        const img=await this.page.screenshot({path:`./test-result/screenshots/${pickle.name}.png`,type:"png"})
        await this.attach(img,"image/png")
    }

    await this.page.close();
    await this.context.close();
    await this.browser.close();
});