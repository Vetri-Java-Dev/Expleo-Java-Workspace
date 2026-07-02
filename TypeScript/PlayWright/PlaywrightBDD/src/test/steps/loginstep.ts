import { CustomWorld } from './../../hooks/world';
import { expect} from '@playwright/test';
import { Given, Then, When} from '@cucumber/cucumber'

Given('User clicks on login link', async function (this:CustomWorld) {

    await this.page.goto("https://tutorialsninja.com/demo/")

    await this.page.click("//span[normalize-space()='My Account']")
    await this.page.click("//a[text()='Login']")
});

Given('User enters the email as {string}', async function (this:CustomWorld,email: string) {
    await this.page.fill("//input[@id='input-email']",email)
});

Given('User enters the password as {string}', async function (this:CustomWorld,password:string) {
    await this.page.fill("//input[@id='input-password']",password)
});

When('User clicks login button', async function (this:CustomWorld) {
    await this.page.click("//input[@value='Login']")
});

Then('Login should be access', async function (this:CustomWorld) {
    await expect(this.page.locator("//h2[normalize-space()='My Account']")).toBeVisible()
});

Then('error message should be displayed', async function (this:CustomWorld) {
    await expect(this.page.locator("//div[@class='alert alert-danger alert-dismissible']")).toBeVisible()
});