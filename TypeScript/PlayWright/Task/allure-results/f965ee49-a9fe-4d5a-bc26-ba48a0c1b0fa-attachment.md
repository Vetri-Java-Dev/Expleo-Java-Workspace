# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: datadriven.test.ts >> Login using json test data >> Login Test with username: admin and password: admin  @login
- Location: tests\datadriven.test.ts:42:13

# Error details

```
Error: expect(locator).toContainText(expected) failed

Locator: locator('#nameofuser')
Expected substring: "Welcome ${username}"
Received string:    "Welcome admin"

Call log:
  - Expect "toContainText" with timeout 5000ms
  - waiting for locator('#nameofuser')
    2 × locator resolved to <a href="#" id="nameofuser" class="nav-link">Welcome admin</a>
      - unexpected value "Welcome admin"

```

```yaml
- link "Welcome admin":
  - /url: "#"
```

# Test source

```ts
  1  | import { JSON2SheetOpts } from './../node_modules/xlsx/types/index.d';
  2  | import {test, expect} from '@playwright/test'
  3  | import * as XLSX from 'xlsx'
  4  | import loginData from "../test-data/loginData.json";
  5  | 
  6  | 
  7  | const workbook=XLSX.readFile("./data/login_data.xlsx")
  8  | const sheet=workbook.Sheets["ValidLoginData"]
  9  | 
  10 | const testData:any=XLSX.utils.sheet_to_json(sheet)
  11 | 
  12 | test.describe("Login",()=>{
  13 | 
  14 |     for(const {username, password} of testData) {
  15 |         test(`Login Test with username: ${username} and password: ${password}  @login`, async ({page}) => {
  16 |             
  17 |             await page.goto('https://demoblaze.com/');
  18 |             await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
  19 | 
  20 |             await page.getByRole('link', { name: 'Log in' }).click();
  21 |             await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
  22 | 
  23 |             await page.locator('#loginusername').fill(username);
  24 |             await page.locator('#loginpassword').fill(password);
  25 | 
  26 |             await page.getByRole('button', { name: 'Log in' }).click();
  27 | 
  28 |             await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible({timeout: 100000});
  29 |             await expect(page.locator('#nameofuser')).toContainText('Welcome ');
  30 | 
  31 |             expect(await page.title()).toContain('STORE');
  32 |             expect(page.url()).toContain('https://demoblaze.com/');
  33 | 
  34 |         })
  35 |     }
  36 | })
  37 | 
  38 | const jsonData=loginData
  39 | test.describe("Login using json test data",()=>{
  40 | 
  41 |     for(const {username, password} of jsonData) {
  42 |         test(`Login Test with username: ${username} and password: ${password}  @login`, async ({page}) => {
  43 |             
  44 |             await page.goto('https://demoblaze.com/');
  45 |             await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
  46 | 
  47 |             await page.getByRole('link', { name: 'Log in' }).click();
  48 |             await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
  49 | 
  50 |             await page.locator('#loginusername').fill(username);
  51 |             await page.locator('#loginpassword').fill(password);
  52 | 
  53 |             await page.getByRole('button', { name: 'Log in' }).click();
  54 | 
  55 |             await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible({timeout: 100000});
> 56 |             await expect(page.locator('#nameofuser')).toContainText('Welcome ${username}');
     |                                                       ^ Error: expect(locator).toContainText(expected) failed
  57 | 
  58 |             expect(await page.title()).toContain('STORE');
  59 |             expect(page.url()).toContain('https://demoblaze.com/');
  60 | 
  61 |         })
  62 |     }
  63 | })
```