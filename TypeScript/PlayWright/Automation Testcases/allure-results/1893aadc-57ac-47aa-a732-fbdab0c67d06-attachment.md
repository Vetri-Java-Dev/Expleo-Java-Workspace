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

Locator:  locator('//div[@class=\'status alert alert-success\']')
Expected: visible
Received: hidden
Timeout:  5000ms

Call log:
  - Expect "toBeVisible" with timeout 5000ms
  - waiting for locator('//div[@class=\'status alert alert-success\']')
    11 × locator resolved to <div class="status alert alert-success"></div>
       - unexpected value "hidden"

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
- heading "Contact Us" [level=2]:
  - text: Contact
  - strong: Us
- text: "Note: Below contact form is for testing purpose."
- link "Software testing services":
  - img
  - text: Software testing services
- heading "Get In Touch" [level=2]
- textbox "Name"
- textbox "Email"
- textbox "Subject"
- textbox "Your Message Here"
- button "Choose File"
- button "Submit"
- heading "Feedback For Us" [level=2]
- paragraph: We really appreciate your response to our website.
- paragraph:
  - text: Kindly share your feedback with us at
  - link "feedback@automationexercise.com":
    - /url: mailto:feedback@automationexercise.com
  - text: .
- paragraph: If you have any suggestion areas or improvements, do let us know. We will definitely work on it.
- paragraph: Thank you
- insertion:
  - iframe
- contentinfo:
  - heading "Subscription" [level=2]
  - textbox "Your email address"
  - button ""
  - paragraph: Get the most recent updates from our site and be updated your self...
  - paragraph: Copyright © 2021 All rights reserved
- insertion:
  - heading "These are topics related to the article that might interest you" [level=2]: Discover more
  - link "Intellectual Property"
  - link "Language Resources"
  - link "Network Security"
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