import {Locator, Page} from "@playwright/test"
import { BasePage } from "./BasePage";

export class RegisterPage extends BasePage{

    readonly maleCheck : Locator
    readonly femaleCheck : Locator
    readonly firstName : Locator
    readonly lastName : Locator
    readonly email : Locator
    readonly password : Locator
    readonly confirmPassword : Locator
    readonly submit : Locator
    readonly success : Locator
    readonly error : Locator

    constructor(page : Page){
        super(page)
        this.maleCheck=page.locator("//input[@id='gender-male']")
        this.femaleCheck=page.locator("//input[@id='gender-female']")
        this.firstName=page.locator("//input[@id='FirstName']")
        this.lastName=page.locator("//input[@id='LastName']")
        this.email=page.locator("//input[@id='Email']")
        this.password=page.locator("//input[@id='Password']")
        this.confirmPassword=page.locator("//input[@id='ConfirmPassword']")
        this.submit=page.locator("//input[@id='register-button']")
        this.success=page.locator("//div[@class='result']")
        this.error=page.locator("//li[normalize-space()='The specified email already exists']")
    }

    async register(gender : string, firstName : string, lastName : string, email : string, password : string, confirmPassword : string){
        
        if(gender.toLowerCase()==="male"){
            await this.click(this.maleCheck)
        }
        else if(gender.toLowerCase()==="female"){
            await this.click(this.femaleCheck)
        }
        else{
            throw Error("Invalid gender")
        }

        await this.fill(this.firstName,firstName)
        await this.fill(this.lastName,lastName)
        await this.fill(this.email,email)
        await this.fill(this.password,password)
        await this.fill(this.confirmPassword,confirmPassword)

    }

    async clickSubmit(){
        await this.click(this.submit)
    }
    
    async isRegistrationSuccess(){
        return await this.isVisible(this.success)
    }

    async isError(){
        return await this.isVisible(this.error)
    }



}