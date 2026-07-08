import {Locator, Page} from "@playwright/test"
import { BasePage } from "./BasePage";

export class HomePage extends BasePage{

    readonly register : Locator
    readonly login : Locator

    constructor(page : Page){
        super(page)
        this.register=page.locator("//a[@class='ico-register']")
        this.login=page.locator("//a[@class='ico-login']")
    }

    async clickRegister(){
        await this.click(this.register)
    }
    async clickLogin(){
        await this.click(this.login)
    }

    async launchApplication(){
        await this.page.goto("https://demowebshop.tricentis.com/")
    }
}