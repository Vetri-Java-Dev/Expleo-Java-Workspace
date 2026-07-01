import { test, expect } from "../fixtures/baseFixtures";

test.describe("Search test @Regression", () => {

    test.beforeEach(async ({ page }) => {
        await page.goto("https://tutorialsninja.com/demo", {
            waitUntil: "networkidle"
        });
    });

    test("Valid search", async ({ searchPage, page }) => {
        const keyword="MacBook";

        await searchPage.searchProduct(keyword);
        
        await expect(searchPage.pageHeading).toBeVisible();

        const resultsCount=await searchPage.getResultsCount();
        expect(resultsCount).toBeGreaterThan(0);

        const products=await searchPage.getProductTitles();
        console.log("Search results: ", products);

        const hasMatch=products.some(title=>title.toLowerCase().includes(keyword.toLowerCase()));
        expect(hasMatch).toBeTruthy();
    });

});