import { CustomWorld } from './../../hooks/world';
import { expect} from '@playwright/test';
import { Given, Then, When} from '@cucumber/cucumber';

Given('User navigates to the application', async function () {
    await this.page.goto("https://tutorialsninja.com/demo/")
});

Given('User clicks on register link', async function (this:CustomWorld) {
    await this.page.click("//span[normalize-space()='My Account']")
    await this.page.click("//a[normalize-space()='Register']")
});

Given('User enters the first name as {string}', async function (this:CustomWorld,firstName:string) {
    await this.page.fill("//input[@id='input-firstname']",firstName)
});

Given('User enters the last name as {string}', async function (this:CustomWorld,lastName: string) {
    await this.page.fill("//input[@id='input-lastname']",lastName)
});

Given('User enters the email as {string} for registration', async function (this:CustomWorld,email:string) {
    await this.page.fill("//input[@id='input-email']",email)
});

Given('User enters the phone as {string}', async function (this:CustomWorld,phone : string) {
    await this.page.fill("//input[@id='input-telephone']",phone)
});

Given('User enters the password as {string} and confirmation password as {string}', async function (this:CustomWorld,password:string, confirmPassword : string) {
    await this.page.fill("//input[@id='input-password']",password)
    await this.page.fill("//input[@id='input-confirm']",confirmPassword)
});

Given('User accepts privacy policy', async function (this:CustomWorld) {
    await this.page.click("//input[@name='agree']")
});

When('User clicks register button', async function (this:CustomWorld) {
    await this.page.click("//input[@value='Continue']")
});

Then('success message should be visible', async function (this:CustomWorld) {
    await expect(this.page.locator("//h1[normalize-space()='Your Account Has Been Created!']")).toBeVisible()
});