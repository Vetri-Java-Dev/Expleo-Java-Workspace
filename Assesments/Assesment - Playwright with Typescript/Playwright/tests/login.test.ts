import { test, expect } from "../fixtures/baseFixtures";
import loginData from "../test-data/loginData.json";

test.describe("Login test @Smoke",()=> {

    test.beforeEach(async ({ page }) => {
        await page.goto("https://tutorialsninja.com/demo", {
            waitUntil: "networkidle"
        });
    });

    test("Valid login", async ({ homePage, loginPage})=>{
        await homePage.clickMyAccountMenu();
        await homePage.clickLogin();

        await loginPage.login(loginData.valid.email, loginData.valid.password);

        await expect(loginPage.myAccount).toBeVisible();
    });

    test("Invalid login", async ({ homePage, loginPage}) => {
        
        await homePage.clickMyAccountMenu();
        await homePage.clickLogin();

        await loginPage.login(loginData.invalidEmail.email, loginData.invalidEmail.password);

        await expect(loginPage.warning).toBeVisible();

        const errorText=await loginPage.getErrorMessage();
        console.log("Message : ", errorText);

        expect(errorText).toContain("Warning");

    });

});