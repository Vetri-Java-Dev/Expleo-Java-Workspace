import {Before, After, BeforeAll, AfterAll, Status} from "@cucumber/cucumber"
import { chromium } from "@playwright/test"
import { CustomWorld } from "../world/CustomWorld"
import { LoginPage } from "../pages/loginPage"
import { HomePage } from "../pages/homePage"

let browser : any 

Before({timeout: 30000},async function (this:CustomWorld,scenario) {
    browser=await chromium.launch({headless:false})

    this.browser=browser
    this.context=await browser.newContext()
    this.page=await this.context.newPage()

    this.loginPage = new LoginPage(this.page);
    this.homePage = new HomePage(this.page);
})

After(async function (this:CustomWorld,{pickle,result}) {

    if(result?.status==Status.FAILED && this.page){
        const img=await this.page.screenshot({path:`./reports/screenshots/${pickle.name}${Date.now()}.png`,type:"png"})
        await this.attach(img,"image/png")
    }

    if(this.page){
        await this.page.close();
    }

    if(this.context){
        await this.context.close();
    }

    if(this.browser){
        await this.browser.close();
    }
});