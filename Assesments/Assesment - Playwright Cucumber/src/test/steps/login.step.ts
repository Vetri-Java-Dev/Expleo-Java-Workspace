import { Given,Then,When } from "@cucumber/cucumber";
import { CustomWorld } from "../world/customworld";
import { readData } from "../utility/csvreader";
import { LoginData } from "../type/LoginData";
import { expect } from "@playwright/test";

When('the user clicks login button', async function (this : CustomWorld) {
    await this.homePage.clickLogin()
});

Then('user redirects to login page', async function (this : CustomWorld) {
});

When('the user enters {string} login credentials', async function (this : CustomWorld, type: string) {
    
    const credentials=readData<LoginData>("test-data/login-data.csv")
    const row=credentials.find(credential=>credential.type===type)

    if(!row){
        throw new Error(`No login data found for type "${type}" in login-data.csv`);
    }
    await this.loginPage.login(row.email, row.password)

});

When('the user clicks the login button', async function (this : CustomWorld) {
    await this.loginPage.clickSubmit()
});

Then('user should be successfully logged in', async function (this : CustomWorld) {
    await expect(await this.loginPage.isLoginSuccess()).toBeTruthy()
});

Then('user should not be successfully logged in', async function (this : CustomWorld) {
    await expect(await this.loginPage.isError()).toBeTruthy()
});
