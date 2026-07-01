import {Page} from "@playwright/test"

export class HomePage{

    readonly page;
    readonly myAccount;
    readonly register;
    readonly login;
    readonly search;

    constructor(page : Page){
        this.page=page
        this.myAccount=page.locator("//*[@id='top-links']/ul/li[2]/a")
        this.register=page.locator("//a[normalize-space()='Register']")
        this.login=page.locator("//*[@id='top-links']/ul/li[2]/ul/li[2]/a")
        this.search=page.locator("//*[@id='search']/input")
    }

    async clickMyAccountMenu(){
        await this.myAccount.click()
    }

    async clickRegister(){
        await this.register.click()
    }

    async clickLogin(){
        await this.login.click()
    }

}