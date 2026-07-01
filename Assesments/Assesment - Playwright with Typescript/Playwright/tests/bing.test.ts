import { test, expect } from "@playwright/test";

test("Bing Search Test", async ({ page }) => {

    await page.goto("https://www.bing.com/");

    const title=await page.title();
    console.log(title);

    const url=page.url();
    console.log(url);

    await expect(page).toHaveTitle(/Bing/);
    expect(url).toContain("bing.com");

    const box=page.locator("#sb_form_q");

    console.log(await box.innerText());
    console.log(await box.getAttribute("name"));

    await box.fill("playwright");
    await box.press("Enter");

    await page.locator("h2 a").first().click();
    await expect(page).toHaveTitle(/Playwright/i);
});