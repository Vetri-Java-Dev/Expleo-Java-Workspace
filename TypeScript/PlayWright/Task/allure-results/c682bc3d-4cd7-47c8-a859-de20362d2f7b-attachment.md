# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: parameterize.test.ts >> Bing Search using Parameterization >> Search Testng
- Location: tests\parameterize.test.ts:13:13

# Error details

```
Error: expect(locator).toBeVisible() failed

Locator: locator('li.b_algo h2 a').first()
Expected: visible
Timeout: 5000ms
Error: element(s) not found

Call log:
  - Expect "toBeVisible" with timeout 5000ms
  - waiting for locator('li.b_algo h2 a').first()

```

```yaml
- main:
  - heading "Microsoft Logo Image" [level=1]:
    - img "Microsoft Logo Image"
  - navigation:
    - menubar:
      - menuitem "Copilot":
        - link "Copilot":
          - /url: /chat?FORM=hpcodx&intent=bing
      - menuitem "Images":
        - link "Images":
          - /url: /images?FORM=Z9LH
      - menuitem "Videos":
        - link "Videos":
          - /url: /videos?FORM=Z9LH1
      - menuitem "Shopping":
        - link "Shopping":
          - /url: /shop?FORM=Z9LHS4
      - menuitem "Maps":
        - link "Maps":
          - /url: /maps?FORM=Z9LH2
      - menuitem "News":
        - link "News":
          - /url: /news/search?q=Top+stories&nvaug=%5bNewsVertical+Category%3d%22rt_MaxClass%22%5d&FORM=Z9LH3
      - menuitem ". . . More":
        - text: . . .
        - button "More"
  - search:
    - combobox "Enter your search here - Search suggestions will show as you type":
      - text: Testng
      - status
    - button "Search using voice":
      - img
    - button "Search using an image"
    - link "Open Copilot":
      - /url: /chat?FORM=hpcodx&intent=bing
```

# Test source

```ts
  1  | import { test, expect } from "@playwright/test";
  2  | 
  3  | const searchdata = [
  4  |     { keyword : "Selenium", expectedResult : "Selenium" },
  5  |     { keyword : "Playwright", expectedResult : "Playwright" },
  6  |     { keyword : "Testng", expectedResult : "Testng" }
  7  | ];
  8  | 
  9  | test.describe.parallel("Bing Search using Parameterization", () => {
  10 | 
  11 |     for (const data of searchdata) {
  12 | 
  13 |         test(`Search ${data.keyword}`, async ({ page }) => {
  14 | 
  15 |             await page.goto("https://www.bing.com/");
  16 | 
  17 |             await page.fill("textarea[name='q']", data.keyword);
  18 | 
  19 |             await page.keyboard.press("Enter");
  20 | 
  21 |             const firstResult=page.locator("li.b_algo h2 a").first();
  22 | 
> 23 |             await expect(firstResult).toBeVisible();
     |                                       ^ Error: expect(locator).toBeVisible() failed
  24 | 
  25 |             const resultText=await firstResult.textContent();
  26 | 
  27 |             console.log("Search Keyword :", data.keyword);
  28 |             console.log("First Result :", resultText);
  29 | 
  30 |             expect(resultText?.toLowerCase()).toContain(data.expectedResult.toLowerCase());
  31 | 
  32 |             await firstResult.click();
  33 | 
  34 |             await expect(page).not.toHaveURL(/bing\.com\/$/);
  35 | 
  36 |         });
  37 | 
  38 |     }
  39 | 
  40 | });
```