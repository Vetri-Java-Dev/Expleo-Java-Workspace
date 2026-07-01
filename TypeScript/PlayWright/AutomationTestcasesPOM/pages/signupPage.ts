import {Page} from "@playwright/test"
import {BasePage} from "../pages/basePage"

export class SignupPage extends BasePage{

    readonly name;
    readonly email;
    readonly submit;

    readonly password;

    readonly firstName;
    readonly lastName;
    readonly address;
    readonly state;
    readonly city;
    readonly zipcode;
    readonly mobile;
    readonly createAccount;

    readonly accountCreatedMessage;

    constructor(page : Page){

        super(page)
        this.name=page.locator("//input[@placeholder='Name']")
        this.email=page.locator("//input[@data-qa='signup-email']")
        this.submit=page.locator("//button[normalize-space()='Signup']")

        this.password=page.locator("//input[@id='password']")

        this.firstName=page.locator("//input[@id='first_name']")
        this.lastName=page.locator("//input[@id='last_name']")
        this.address=page.locator("//input[@id='address1']")
        this.state=page.locator("//input[@id='state']")
        this.city=page.locator("//input[@id='city']")
        this.zipcode=page.locator("//input[@id='zipcode']")
        this.mobile=page.locator("//input[@id='mobile_number']")

        this.createAccount=page.locator("//button[normalize-space()='Create Account']")

        this.accountCreatedMessage=page.locator("//b[normalize-space()='Account Created!']")

    }

    async fillDetails(name : string, email : string){
        await this.name.fill(name)
        await this.email.fill(email)
        await this.submit.click()
    }

    async signUp(password : string, firstName : string, lastName : string, address : string, state : string, city : string, zipcode : string, mobile : string){
        
        await this.password.fill(password)
        await this.firstName.fill(firstName)
        await this.lastName.fill(lastName)
        await this.address.fill(address)
        await this.state.fill(state)
        await this.city.fill(city)
        await this.zipcode.fill(zipcode)
        await this.mobile.fill(mobile)

        await this.createAccount.click()
    }

    async isAccountCreated(){
        return await this.accountCreatedMessage.isVisible()
    }




}