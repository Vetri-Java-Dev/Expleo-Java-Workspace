# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase4.test.ts >> Testcase 4 - Log out 
- Location: tests\TestCase4.test.ts:3:5

# Error details

```
Error: expect(locator).toContainText(expected) failed

Locator: locator('//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[10]/a')
Expected substring: "Logged in"
Timeout: 5000ms
Error: element(s) not found

Call log:
  - Expect "toContainText" with timeout 5000ms
  - waiting for locator('//*[@id=\'header\']/div/div/div/div[2]/div/ul/li[10]/a')
    - waiting for navigation to finish...

```

```yaml
- banner:
  - link "Website for automation practice":
    - /url: /
    - img "Website for automation practice"
  - list:
    - listitem:
      - link " Home":
        - /url: /
    - listitem:
      - link " Products":
        - /url: /products
    - listitem:
      - link " Cart":
        - /url: /view_cart
    - listitem:
      - link " Signup / Login":
        - /url: /login
    - listitem:
      - link " Test Cases":
        - /url: /test_cases
    - listitem:
      - link " API Testing":
        - /url: /api_list
    - listitem:
      - link " Video Tutorials":
        - /url: https://www.youtube.com/c/AutomationExercise
    - listitem:
      - link " Contact us":
        - /url: /contact_us
- heading "Login to your account" [level=2]
- textbox "Email Address": bvetrivel@gmail.com1000
- textbox "Password": Vetri@12345
- button "Login"
- heading "OR" [level=2]
- heading "New User Signup!" [level=2]
- textbox "Name"
- textbox "Email Address"
- button "Signup"
- contentinfo:
  - heading "Subscription" [level=2]
  - textbox "Your email address"
  - button ""
  - paragraph: Get the most recent updates from our site and be updated your self...
  - paragraph: Copyright © 2021 All rights reserved
```

# Test source

```ts
  1  | import { test,chromium,expect,Page,Browser } from '@playwright/test';
  2  | 
  3  | test("Testcase 4 - Log out ",async({page})=>{
  4  |    
  5  |     await page.goto("https://automationexercise.com/")
  6  | 
  7  |     await page.click("//a[normalize-space()='Signup / Login']");
  8  | 
  9  |     await page.fill("//input[@data-qa='login-email']","bvetrivel@gmail.com1000")
  10 |     await page.fill("//input[@placeholder='Password']","Vetri@12345")
  11 | 
  12 |     await page.click("//button[normalize-space()='Login']")
  13 | 
> 14 |     await expect(page.locator("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a")).toContainText("Logged in")
     |                                                                                        ^ Error: expect(locator).toContainText(expected) failed
  15 | 
  16 |     await page.click("//a[normalize-space()='Logout']")
  17 | 
  18 |     await expect(page.locator("//h2[normalize-space()='Login to your account']")).toContainText("Login")
  19 | 
  20 | });
```