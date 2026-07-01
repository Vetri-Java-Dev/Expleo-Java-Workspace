import {Page} from "@playwright/test"

export class RegisterPage{
    readonly page;
    readonly firstName;
    readonly lastName;
    readonly email;
    readonly password;
    readonly phone;
    readonly confirmationPassword;
    readonly privacyCheck;
    readonly submit;
    readonly successMessage;

    constructor(page : Page){
        this.page=page
        this.firstName=page.locator("//input[@id='input-firstname']")
        this.lastName=page.locator("//input[@id='input-lastname']")
        this.email=page.locator("//input[@id='input-email']")
        this.phone=page.locator("//input[@id='input-telephone']")
        this.password=page.locator("//input[@id='input-password']")
        this.confirmationPassword=page.locator("//input[@id='input-confirm']")
        this.privacyCheck=page.locator("//input[@name='agree']")
        this.submit=page.locator("//input[@value='Continue']")
        this.successMessage=page.locator("//*[@id='content']/h1")
    }

    async register(firstName : string,lastName : string,
                   email : string,phone : string,
                   password : string,confirmationPassword : string){
        
        await this.firstName.fill(firstName)
        await this.lastName.fill(lastName)
        await this.email.fill(email)
        await this.phone.fill(phone)
        await this.password.fill(password)
        await this.confirmationPassword.fill(confirmationPassword)

        await this.privacyCheck.check()
        await this.submit.click()  
    }

    async isAccountCreated(){
        return this.successMessage.isVisible()
    }

}