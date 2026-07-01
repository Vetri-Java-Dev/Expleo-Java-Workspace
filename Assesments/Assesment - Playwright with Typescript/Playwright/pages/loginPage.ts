import {Page} from "@playwright/test"

export class LoginPage{
    readonly page;
    readonly email;
    readonly password;
    readonly submit;
    readonly warning;
    readonly myAccount;

    constructor(page : Page){
        this.page=page
        this.email=page.locator("//input[@id='input-email']")
        this.password=page.locator("//input[@id='input-password']")
        this.submit=page.locator("//input[@value='Login']")
        this.warning = page.locator("//div[contains(@class,'alert-danger')]")
        this.myAccount=page.locator("//h2[normalize-space()='My Account']")
    }

    async login(email : string, password : string){
        await this.email.fill(email)
        await this.password.fill(password)

        await this.submit.click()
    }

    async getErrorMessage(){
        return await this.warning.textContent()
    }

    async isWarned(){
        return await this.warning.isVisible()
    }

}