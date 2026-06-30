import { test, expect } from "../fixtures/baseFixtures";
import JsonData from "../test-data/loginData.json";


interface LoginData {
    type: string;
    username: string;
    password: string;
}


const loginData=JsonData as LoginData[];

const validUser=loginData.find(user => user.type === "valid");
const invalidUser=loginData.find(user => user.type === "invalid");


test.describe("Login Test Group", () => {

    test("Valid Login", async ({ loginPage, homePage }) => {

        await homePage.navigateToHome();
        await homePage.clickLogin();

        await loginPage.login(validUser!.username,validUser!.password);

        await expect(homePage.logout).toBeVisible();
    });



    test("Invalid Login", async ({ loginPage, homePage, page }) => {

        await homePage.navigateToHome();

        await homePage.clickLogin();

        page.once("dialog", async dialog => {
            expect(dialog.message()).toBe("Wrong password.");
            await dialog.accept();
        });


        await loginPage.login(invalidUser!.username,invalidUser!.password);

    });


});