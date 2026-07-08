import { Locator, Page } from "@playwright/test"


export class BasePage{

    readonly page : Page

    constructor(page: Page){
        this.page=page
    }

    async click(loctaor : Locator){
        await loctaor.click()
    }

    async fill(locator : Locator, text : string){
        await locator.fill(text)
    }

    async isVisible(locator : Locator){
        return await locator.isVisible()
    }

    async getUrl(){
        return this.page.url()
    }
}