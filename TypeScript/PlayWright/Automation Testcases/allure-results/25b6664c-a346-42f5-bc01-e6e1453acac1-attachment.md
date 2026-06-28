# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase5.test.ts >> Testcase 5 - Email already exists
- Location: tests\TestCase5.test.ts:3:5

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: page.fill: Test timeout of 30000ms exceeded.
Call log:
  - waiting for locator('//input[@placeholder=\'Name\']')

```

# Test source

```ts
  1  | import { test,chromium,expect,Page,Browser } from '@playwright/test';
  2  | 
  3  | test("Testcase 5 - Email already exists",async({page})=>{
  4  |    
  5  |     
  6  |     await page.goto("https://automationexercise.com/")
  7  | 
  8  |     await page.click("//a[normalize-space()='Signup / Login']");
  9  | 
> 10 |     await page.fill("//input[@placeholder='Name']","Vetri")
     |                ^ Error: page.fill: Test timeout of 30000ms exceeded.
  11 |     await page.fill("//input[@data-qa='signup-email']","bvetrivel@gmail.com1000")
  12 | 
  13 |     await page.click("//button[normalize-space()='Signup']")
  14 | 
  15 |     await expect(page.locator("//p[normalize-space()='Email Address already exist!']")).toContainText("Email Address already exist!")
  16 | 
  17 | });
```