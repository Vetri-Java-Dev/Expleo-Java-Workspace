# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: group.test.ts >> Authentication >> login - 3 
- Location: tests\group.test.ts:25:9

# Error details

```
Error: page.goto: Target page, context or browser has been closed
Call log:
  - navigating to "https://www.demoblaze.com/", waiting until "load"

```

# Test source

```ts
  1  | import { test, expect } from '@playwright/test';
  2  | 
  3  | test.describe("Authentication",()=>{
  4  | 
  5  |     test("login - 1 ",async({page})=>{
  6  | 
  7  |     await page.goto("https://www.demoblaze.com/")
  8  | 
  9  |     await page.click("//a[@id='login2']")
  10 | 
  11 |     await page.fill("#loginusername","admin")
  12 |     await page.fill("#loginpassword","admin")
  13 | 
  14 |     await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")
  15 | 
  16 |     //soft assertion
  17 |     await expect.soft(page.locator("//a[@id='logout2']").textContent(),"Log Out")
  18 |     await expect.soft(page.locator("//a[@id='logout2']")).toBeVisible()
  19 | 
  20 |     await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")
  21 | 
  22 |     })
  23 | 
  24 | 
  25 |     test("login - 3 ",async({page})=>{
  26 | 
> 27 |         await page.goto("https://www.demoblaze.com/")
     |                    ^ Error: page.goto: Target page, context or browser has been closed
  28 | 
  29 |         await page.click("//a[@id='login2']")
  30 | 
  31 |         await page.fill("#loginusername","admin")
  32 |         await page.fill("#loginpassword","admin")
  33 | 
  34 |         await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")
  35 | 
  36 |         //soft assertion
  37 |         await expect.soft(page.locator("//a[@id='logout2']").textContent(),"Log Out")
  38 |         await expect.soft(page.locator("//a[@id='logout2']")).toBeVisible()
  39 | 
  40 |         await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")
  41 | 
  42 |     })
  43 | 
  44 |     test("login - 2 ",async({page})=>{
  45 | 
  46 |         await page.goto("https://www.demoblaze.com/")
  47 | 
  48 |         await page.click("//a[@id='login2']")
  49 | 
  50 |         await page.fill("//a[@id='login2']","admin")
  51 |         await page.fill("//a[@id='login2']","admin")
  52 | 
  53 |         await page.click("//a[@id='login2']")
  54 | 
  55 |         //soft assertion
  56 |         await expect.soft(page.locator("//a[@id='logout2']").textContent(),"Log Out")
  57 |         await expect.soft(page.locator("//a[@id='logout2']")).toBeVisible()
  58 | 
  59 |         await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")
  60 | 
  61 |     })
  62 | })
```