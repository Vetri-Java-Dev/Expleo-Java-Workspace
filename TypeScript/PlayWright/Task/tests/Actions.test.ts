import { test, expect } from "@playwright/test";

test.beforeEach(async ({ page }) => {
    await page.goto("https://demoqa.com/");
});

test.afterEach(async ({ page }) => {
    await page.close();
});

// test("Hover Action", async ({ page }) => {
//     await page.goto("https://omayo.blogspot.com/");
//     await page.locator("//span[text()='Blogs']").hover();
//     await page.waitForTimeout(3000);
// });

test("Double Click", async ({ page }) => {
    test.setTimeout(60000);
    await page.goto("https://demoqa.com/buttons");
    await page.locator("#doubleClickBtn").dblclick();
    await expect(page.locator("#doubleClickMessage")).toHaveText("You have done a double click");
    await page.waitForTimeout(3000);
});

test("Right Click", async ({ page }) => {
    page.setDefaultTimeout(5000);
    await page.goto("https://demoqa.com/buttons");
    await page.locator("#rightClickBtn").click({button: "right"});
    await expect(page.locator("#rightClickMessage")).toHaveText("You have done a right click");
    await page.waitForTimeout(3000);
});

test("Drag and Drop", async ({ page }) => {
    await page.goto("https://demoqa.com/droppable");
    const source = page.locator("#draggable");
    const target = page.locator("//div[@id='simpleDropContainer']/div[2]");
    await source.dragTo(target);
    await expect(target).toContainText("Dropped!");
});

test("Keyboard Type", async ({ page }) => {
    await page.goto("https://demoqa.com/text-box");
    await page.locator("#userName").click();
    await page.keyboard.type("Darshan");
    await expect(page.locator("#userName")).toHaveValue("Darshan");
    await page.waitForTimeout(3000);
});

test("Press Enter", async ({ page }) => {
    await page.goto("https://demoqa.com/text-box");
    await page.locator("#userName").click();
    await page.keyboard.type("Darshan");
    await page.keyboard.press("Enter");
    await expect(page.locator("#userName")).toHaveValue("Darshan",{timeout: 7000});
    await page.waitForTimeout(3000);
});