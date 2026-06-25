# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase6.test.ts >> Testcase 6 - Contact Us Form
- Location: tests\TestCase6.test.ts:3:5

# Error details

```
Error: expect(locator).toBeVisible() failed

Locator: locator('//div[@class=\'status alert alert-success\']')
Expected: visible
Timeout: 5000ms
Error: element(s) not found

Call log:
  - Expect "toBeVisible" with timeout 5000ms
  - waiting for locator('//div[@class=\'status alert alert-success\']')

```

# Test source

```ts
  1  | import { test, expect } from '@playwright/test';
  2  | 
  3  | test("Testcase 6 - Contact Us Form", async ({ page }) => {
  4  | 
  5  |     await page.goto("https://automationexercise.com/");
  6  | 
  7  |     await expect(page).toHaveTitle("Automation Exercise");
  8  | 
  9  |     await page.click("//a[normalize-space()='Contact us']");
  10 | 
  11 |     await expect(page.locator("//h2[text()='Get In Touch']")).toBeVisible();
  12 | 
  13 | 
  14 |     await page.fill("//input[@name='name']", "Vetri");
  15 |     await page.fill("//input[@name='email']", "bvetrivel@gmail.com");
  16 |     await page.fill("//input[@name='subject']", "Demo mail");
  17 |     await page.fill("//textarea[@id='message']", "This is message");
  18 | 
  19 |     page.once('dialog', async dialog => {
  20 |         console.log("Alert message: " + dialog.message());
  21 |         await dialog.accept();
  22 |     });
  23 | 
  24 |     await page.click("//input[@data-qa='submit-button']");
  25 | 
> 26 |     await expect(page.locator("//div[@class='status alert alert-success']")).toBeVisible();
     |                                                                              ^ Error: expect(locator).toBeVisible() failed
  27 | 
  28 | });
```