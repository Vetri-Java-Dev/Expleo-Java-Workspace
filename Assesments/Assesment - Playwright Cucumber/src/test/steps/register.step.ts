import {Given,When,Then} from "@cucumber/cucumber"
import { CustomWorld } from "../world/customworld";
import { expect } from "@playwright/test";

Given('user navigates to demowebshop application', async function (this : CustomWorld) {
    await this.homePage.launchApplication()
});

When('the user clicks register button', async function (this : CustomWorld) {
    await this.homePage.clickRegister()
});

Then('user redirects to register page', async function (this : CustomWorld) {
    await console.log(this.homePage.getUrl())
});

When('the user enters {string}, {string}, {string}, {string}, and {string}', async function (this : CustomWorld,gender, firstName,lastName, email, password) {
    await this.registerPage.register(gender,firstName,lastName,email,password,password)
});

When('the user clicks the Register button', async function (this : CustomWorld) {
    await this.registerPage.clickSubmit()
});

Then('the account should be created successfully', async function (this : CustomWorld) {
    await expect(await this.registerPage.isRegistrationSuccess()).toBe(true);
});

Then('an error message should be displayed indicating the email already exists', async function (this : CustomWorld) {
    await expect(await this.registerPage.isError()).toBe(true);
});