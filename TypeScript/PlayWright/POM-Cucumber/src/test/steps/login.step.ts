import {Given, When, Then, DataTable} from "@cucumber/cucumber"
import { CustomWorld } from "../world/CustomWorld";
import Credentials from "../../../test-data/login.json"
import {expect} from "@playwright/test"

Given('User navigates to application', async function (this:CustomWorld) {
    await this.logger.info("User navigating to application")
    await this.loginPage.navigateToLogin()
});

When('User enters credentials', async function (this: CustomWorld,table: DataTable) {

    const data=table.rowsHash() as {
        username: string;
        password: string;
        type: string;
    };

    await this.loginPage.login(data.username,data.password);
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