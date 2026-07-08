import {Locator, Page} from "@playwright/test"
import { BasePage } from "./BasePage";

export class LoginPage extends BasePage{

    readonly email : Locator
    readonly password : Locator
    readonly submit : Locator
    readonly logout : Locator
    readonly wrongPassword : Locator

    constructor(page : Page){
        super(page)
        this.email=page.locator("//input[@id='Email']")
        this.password=page.locator("//input[@id='Password']")
        this.submit=page.locator("//input[@value='Log in']")
        this.logout=page.locator("//a[@class='ico-logout']")
        this.wrongPassword=page.locator("//li[normalize-space()='The credentials provided are incorrect']")
    }

    async login(email : string, password : string){
        await this.fill(this.email,email)
        await this.fill(this.password,password)
    }

    async clickSubmit(){
        await this.click(this.submit)
    }

    async isLoginSuccess(){
        return await this.isVisible(this.logout)
    }

    async isError(){
        return await this.isVisible(this.wrongPassword)
    }

}