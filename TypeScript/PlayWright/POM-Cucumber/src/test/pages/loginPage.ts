import { BasePage } from "./basePage"
import {Locator, Page} from "@playwright/test"
import { url } from "../../../env/env"

export class LoginPage extends BasePage{

    readonly username : Locator
    readonly password : Locator
    readonly submit : Locator
    readonly warning : Locator
    
    constructor(page : Page){
        super(page)
        this.username=this.page.locator("//input[@id='user-name']")
        this.password=this.page.locator("//input[@id='password']")
        this.submit=this.page.locator("//input[@id='login-button']")
        this.warning=this.page.locator("//*[@id='login_button_container']/div/form/div[3]/h3")
    }

    async navigateToLogin(){
        await this.page.goto(url)
    }

    async login(userName : string, password : string){
        await this.fill(this.username,userName)
        await this.fill(this.password,password)
    }

    async clickSubmit(){
        await this.click(this.submit)
    }

    async isWarningVisible(){
        return this.isVisible(this.warning)
    }

}