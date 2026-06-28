# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase3.test.ts >> Testcase 3 - Login using invalid credentials 
- Location: tests\TestCase3.test.ts:3:5

# Error details

```
Error: page.goto: NS_ERROR_NET_ERROR_RESPONSE
Call log:
  - navigating to "https://automationexercise.com/", waiting until "load"

```

# Page snapshot

```yaml
- article "Looks like there’s a problem with this site" [ref=e3]:
  - img "Illustration of a fox looking at disconnected network cables." [ref=e5]
  - generic [ref=e7]:
    - heading "Looks like there’s a problem with this site" [level=1] [ref=e8]
    - paragraph [ref=e9]:
      - text: The server at
      - strong [ref=e10]: automationexercise.com
      - text: "sent back an error: 500 Internal Server Error"
    - generic [ref=e11]:
      - heading "What can you do about it?" [level=3] [ref=e12]
      - list [ref=e13]:
        - listitem [ref=e14]: Check to make sure you’ve typed the website address correctly.
        - listitem [ref=e15]: The site could be temporarily unavailable or too busy. Try again in a few moments.
    - button "Try Again" [ref=e18]:
      - generic [ref=e20]:
        - generic: Try Again
```

# Test source

```ts
  1  | import { test,chromium,expect,Page,Browser } from '@playwright/test';
  2  | 
  3  | test("Testcase 3 - Login using invalid credentials ",async({page})=>{
  4  |    
> 5  |     await page.goto("https://automationexercise.com/")
     |                ^ Error: page.goto: NS_ERROR_NET_ERROR_RESPONSE
  6  | 
  7  |     await page.click("//a[normalize-space()='Signup / Login']");
  8  | 
  9  |     await expect(page.locator("//h2[normalize-space()='Login to your account']")).toContainText("Login to your account")
  10 | 
  11 |     await page.fill("//input[@data-qa='login-email']","bvetrivel@gmail.com")
  12 |     await page.fill("//input[@placeholder='Password']","wrongPassword")
  13 | 
  14 |     await page.click("//button[normalize-space()='Login']")
  15 | 
  16 |     await expect(page.locator("//p[normalize-space()='Your email or password is incorrect!']")).toContainText("incorrect")
  17 | 
  18 | });
```