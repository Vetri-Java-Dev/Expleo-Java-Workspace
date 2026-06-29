import { test, expect } from "@playwright/test";

const searchdata = [
    { keyword : "Selenium", expectedResult : "Selenium" },
    { keyword : "Playwright", expectedResult : "Playwright" },
    { keyword : "Testng", expectedResult : "Testng" }
];

test.describe.parallel("Bing Search using Parameterization", () => {

    for (const data of searchdata) {

        test(`Search ${data.keyword}`, async ({ page }) => {

            await page.goto("https://www.bing.com/");

            await page.fill("textarea[name='q']", data.keyword);

            await page.keyboard.press("Enter");

            const firstResult=page.locator("li.b_algo h2 a").first();

            await expect(firstResult).toBeVisible();

            const resultText=await firstResult.textContent();

            console.log("Search Keyword :", data.keyword);
            console.log("First Result :", resultText);

            expect(resultText?.toLowerCase()).toContain(data.expectedResult.toLowerCase());

            await firstResult.click();

            await expect(page).not.toHaveURL(/bing\.com\/$/);

        });

    }

});