import {Given, When, Then} from "@cucumber/cucumber"
import { CustomWorld } from "../world/CustomWorld";
import Credentials from "../../../test-data/login.json"
import {expect} from "@playwright/test"

Given('User navigates to application', async function (this:CustomWorld) {
    await this.logger.info("User navigating to application")
    await this.loginPage.navigateToLogin()
});

When('User enters {string} credentials', async function (this:CustomWorld,type:string) {

    if(type==="valid"){
        await this.logger.info("User entering valid credentials")
        const validCredentials=Credentials.find(user=>user.type==="valid")
        await this.loginPage.login(validCredentials!.username,validCredentials!.password)
    }
    else if(type==="invalid"){
        await this.logger.info("User entering invalid credentials")
        const invalidCredentials=Credentials.find(user=>user.type==="invalid")
        await this.loginPage.login(invalidCredentials!.username,invalidCredentials!.password)
    }
});

Then('User navigates to homepage', async function (this: CustomWorld) {
    await this.logger.info("User navigating to homepage")
    await expect(this.homePage.productTitle).toBeVisible();
});

When('User clicks login button', async function (this:CustomWorld) {
    await this.logger.info("User clicks login button")
    await this.loginPage.clickSubmit()
});

Then('error message should be displayed', async function (this:CustomWorld) {
    await this.logger.error("Error message displayed")
    expect(await this.loginPage.isWarningVisible()).toBeTruthy()
});