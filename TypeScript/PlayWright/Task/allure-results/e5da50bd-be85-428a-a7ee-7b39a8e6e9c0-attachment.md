# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: skip.test.ts >> login - 3 
- Location: tests\skip.test.ts:44:5

# Error details

```
Error: expect(locator).toBeVisible() failed

Locator: locator('//a[@id=\'logout3\']')
Expected: visible
Timeout: 5000ms
Error: element(s) not found

Call log:
  - Expect "soft toBeVisible" with timeout 5000ms
  - waiting for locator('//a[@id=\'logout3\']')
    - waiting for" https://www.demoblaze.com/" navigation to finish...
    - navigated to "https://www.demoblaze.com/"

```

```
Error: locator.textContent: Test ended.
Call log:
  - waiting for locator('//a[@id=\'logout3\']')

```

# Page snapshot

```yaml
- generic [active] [ref=e1]:
  - text:            
  - navigation [ref=e2]:
    - link "PRODUCT STORE" [ref=e3] [cursor=pointer]:
      - /url: index.html
      - img [ref=e4]
      - text: PRODUCT STORE
    - list [ref=e6]:
      - listitem [ref=e7]:
        - link "Home (current)" [ref=e8] [cursor=pointer]:
          - /url: index.html
          - text: Home
          - generic [ref=e9]: (current)
      - listitem [ref=e10]:
        - link "Contact" [ref=e11] [cursor=pointer]:
          - /url: "#"
      - listitem [ref=e12]:
        - link "About us" [ref=e13] [cursor=pointer]:
          - /url: "#"
      - listitem [ref=e14]:
        - link "Cart" [ref=e15] [cursor=pointer]:
          - /url: cart.html
      - listitem [ref=e16]:
        - link "Log in" [ref=e17] [cursor=pointer]:
          - /url: "#"
      - listitem
      - listitem
      - listitem [ref=e18]:
        - link "Sign up" [ref=e19] [cursor=pointer]:
          - /url: "#"
    - generic [ref=e21]:
      - list [ref=e22]:
        - listitem [ref=e23] [cursor=pointer]
        - listitem [ref=e24] [cursor=pointer]
        - listitem [ref=e25] [cursor=pointer]
      - img "First slide" [ref=e28]
      - button "Previous" [ref=e29] [cursor=pointer]:
        - generic [ref=e31]: Previous
      - button "Next" [ref=e32] [cursor=pointer]:
        - generic [ref=e34]: Next
  - generic [ref=e36]:
    - generic [ref=e38]:
      - link "CATEGORIES" [ref=e39] [cursor=pointer]:
        - /url: ""
      - link "Phones" [ref=e40] [cursor=pointer]:
        - /url: "#"
      - link "Laptops" [ref=e41] [cursor=pointer]:
        - /url: "#"
      - link "Monitors" [ref=e42] [cursor=pointer]:
        - /url: "#"
    - list [ref=e45]:
      - listitem [ref=e46]:
        - button "Previous" [ref=e47]
      - listitem [ref=e48]:
        - button "Next" [ref=e49] [cursor=pointer]
  - generic [ref=e51]:
    - generic [ref=e54]:
      - heading "About Us" [level=4] [ref=e55]
      - paragraph [ref=e56]: We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.
    - generic [ref=e59]:
      - heading "Get in Touch" [level=4] [ref=e60]
      - paragraph [ref=e61]: "Address: 2390 El Camino Real"
      - paragraph [ref=e62]: "Phone: +440 123456"
      - paragraph [ref=e63]: "Email: demo@blazemeter.com"
    - heading "PRODUCT STORE" [level=4] [ref=e67]:
      - img [ref=e68]
      - text: PRODUCT STORE
  - contentinfo [ref=e69]:
    - paragraph [ref=e70]: Copyright © Product Store
```

# Test source

```ts
  1  | import { test, expect } from '@playwright/test';
  2  | 
  3  | test("login - 1 @ValidLogin @Default",async({page})=>{
  4  | 
  5  |     await page.goto("https://www.demoblaze.com/")
  6  | 
  7  |     await page.click("//a[@id='login2']")
  8  | 
  9  |     await page.fill("#loginusername","admin")
  10 |     await page.fill("#loginpassword","admin")
  11 | 
  12 |     await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")
  13 | 
  14 |     //soft assertion
  15 |     await expect.soft(page.locator("//a[@id='logout2']").textContent(),"Log Out")
  16 |     await expect.soft(page.locator("//a[@id='logout2']")).toBeVisible()
  17 | 
  18 |     await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")
  19 | 
  20 | })
  21 | 
  22 | test.skip("login - 2 @Skip",async({page})=>{
  23 | 
  24 |     test.skip(true,"Test under maintanence")
  25 | 
  26 |     await page.goto("https://www.demoblaze.com/")
  27 | 
  28 |     await page.click("//a[@id='login2']")
  29 | 
  30 |     await page.fill("//a[@id='login2']","admin")
  31 |     await page.fill("//a[@id='login2']","admin")
  32 | 
  33 |     await page.click("//a[@id='login2']")
  34 | 
  35 |     //soft assertion
  36 |     await expect.soft(page.locator("//a[@id='logout2']").textContent(),"Log Out")
  37 |     await expect.soft(page.locator("//a[@id='logout2']")).toBeVisible()
  38 | 
  39 |     await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")
  40 | 
  41 | })
  42 | 
  43 | 
  44 | test("login - 3 ",async({page})=>{
  45 | 
  46 |     await page.goto("https://www.demoblaze.com/")
  47 | 
  48 |     await page.click("//a[@id='login2']")
  49 | 
  50 |     await page.fill("#loginusername","admin")
  51 |     await page.fill("#loginpassword","admin")
  52 | 
  53 |     await page.click("//*[@id='logInModal']/div/div/div[3]/button[2]")
  54 | 
  55 |     //soft assertion
> 56 |     await expect.soft(page.locator("//a[@id='logout3']").textContent(),"Log Out")
     |                                                          ^ Error: locator.textContent: Test ended.
  57 |     await expect.soft(page.locator("//a[@id='logout3']")).toBeVisible()
  58 | 
  59 |     await expect(page.locator("//a[@id='nameofuser']").textContent(),"Welcome admin")
  60 | 
  61 | })
  62 | 
  63 | test.afterEach("Resource closing",async({page,},testInfo)=>{
  64 |     console.log("Test title : ",testInfo.title)
  65 |     console.log("Test retry count : ",testInfo.retry)
  66 |     console.log("Test Status : ",testInfo.status)
  67 |     console.log("Duration : ",testInfo.duration)
  68 | })
```