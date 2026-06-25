# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase11.test.ts >> Testcase 11 - Verify Subscription in Cart page
- Location: tests\TestCase11.test.ts:3:5

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: locator.scrollIntoViewIfNeeded: Test timeout of 30000ms exceeded.
Call log:
  - waiting for locator('//h2[text() = \'Subscription\']')
    - waiting for navigation to finish...
    - navigated to "https://automationexercise.com/view_cart"

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
  1  | import { test,expect } from '@playwright/test';
  2  | 
  3  | test("Testcase 11 - Verify Subscription in Cart page",async({page})=>{
  4  |    
  5  |     await page.goto("https://automationexercise.com/")
  6  |     await expect(page).toHaveTitle("Automation Exercise")
  7  | 
  8  |     await page.click("//a[normalize-space()='Cart']");
  9  | 
> 10 |     await page.locator("//h2[text() = 'Subscription']").scrollIntoViewIfNeeded()
     |                                                         ^ Error: locator.scrollIntoViewIfNeeded: Test timeout of 30000ms exceeded.
  11 | 
  12 |     await expect(page.locator("//h2[text() = 'Subscription']")).toBeVisible()
  13 |     
  14 |     await page.fill("//input[@id = 'susbscribe_email']", 'vetrivel@gmail.com')
  15 |     await page.click("//button[@id = 'subscribe']")
  16 |     await expect(page.getByText("You have been successfully subscribed!")).toBeVisible()
  17 | 
  18 | })
```