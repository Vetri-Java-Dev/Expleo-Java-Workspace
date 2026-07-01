import {Page} from "@playwright/test"
import { BasePage } from "./basePage";
import dotenv from "dotenv"

export class HomePage extends BasePage{

    readonly signupLogin;
    // readonly cart;
    // readonly product;

    constructor(page : Page){
        super(page)
        this.signupLogin=page.locator("//a[normalize-space()='Signup / Login']")
    }

    async navigateToHome(){
        await this.page.goto("https://automationexercise.com/")
    }

}