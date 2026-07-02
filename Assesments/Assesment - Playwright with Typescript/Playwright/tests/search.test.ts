import { test, expect } from "../fixtures/baseFixtures";


test.describe("Search test @Regression", () => {

    test.beforeEach(async ({ page }) => {
        await page.goto("https://tutorialsninja.com/demo", {
            waitUntil: "networkidle"
        });
    });

    test("Valid search", async ({ searchPage }) => {

        const keyword="MacBook";

        await searchPage.searchProduct(keyword);

        const products=await searchPage.getProductTitles();

        let found=false;
        for (const product of products) {
            if (product.toLowerCase().includes(keyword.toLowerCase())) {
                found=true;
                break;
            }
        }
        expect(found).toBeTruthy();
    });

});