import {Page, Locator} from "@playwright/test"

export class LoginPage{
    
    readonly page : Page;
    readonly username : Locator;
    readonly password : Locator;
    readonly loginButton : Locator;
    readonly loginTitle : Locator;
    readonly errorMessage : Locator

    constructor(page : Page){
        this.page=page;

        this.username=page.locator("//input[@placeholder='Username']")
        this.password=page.locator("//input[@placeholder='Password']")
        this.loginButton=page.locator("//button[@type='submit']")
        this.loginTitle=page.locator("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
        this.errorMessage=page.locator("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]")
        
    }

    async navigate(){
        await this.page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",{
            waitUntil:"networkidle"
        })
    }

    async getLoginTitle(){
        return await this.loginTitle.textContent()
    }

    async login(username: string, password: string){

        await this.username.fill(username)
        await this.password.fill(password)

        await this.loginButton.click()
    }

    async getErrorMessage(){
        return this.errorMessage.textContent()
    }

}

