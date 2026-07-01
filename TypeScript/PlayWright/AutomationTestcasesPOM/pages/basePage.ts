import {Page, Locator} from "@playwright/test"

export class BasePage{
    readonly page;

    constructor(page : Page){
        this.page=page
    }


    async jsclick(locator : Locator){
        await locator.evaluate((element : HTMLElement)=>{
            element.click()
        })
    }
}
