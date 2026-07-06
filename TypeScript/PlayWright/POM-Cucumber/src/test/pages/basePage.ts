import type { Page, Locator} from "@playwright/test";

export class BasePage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async click(locator : Locator){
        await locator.click()
    }

    async getText(locator : Locator){
        return await locator.textContent()
    }

    async fill(locator : Locator, text : string){
        await locator.fill(text)
    }

    async jsclick(locator: Locator) {
        await locator.evaluate((element) => {
            (element as HTMLElement).click();
        });
    }

    async isVisible(locator : Locator){
        return await locator.isVisible()
    }

    async check(locator : Locator){
        await locator.check()
    }

    async isChecked(locator : Locator){
        return await locator.isChecked()
    }

    async scrollIntoView(locator : Locator){
        await locator.scrollIntoViewIfNeeded()
    }

    async sendInput(locator : Locator, filePath : string){
        await locator.setInputFiles(filePath)
    }

    async getInput(locator : Locator){
        return await locator.inputValue()
    }

    async selectOption(locator : Locator, option : string){
        await locator.selectOption({label:option})
    }

    async getAllTexts(locator : Locator){
        return await locator.allTextContents()
    }
}