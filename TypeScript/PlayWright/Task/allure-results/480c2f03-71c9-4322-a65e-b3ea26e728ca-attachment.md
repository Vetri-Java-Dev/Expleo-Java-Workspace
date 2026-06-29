# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: parameterize.test.ts >> Bing Search using Parameterization >> Search Testng
- Location: tests\parameterize.test.ts:13:13

# Error details

```
Error: page.goto: NS_ERROR_UNKNOWN_HOST
Call log:
  - navigating to "https://www.bing.com/", waiting until "load"

```

# Page snapshot

```yaml
- article "Server Not Found" [ref=e3]:
  - img "Illustration of a fox looking at disconnected network cables." [ref=e5]
  - generic [ref=e7]:
    - heading "Server Not Found" [level=1] [ref=e8]
    - paragraph [ref=e9]:
      - text: Nightly can’t connect to the server at
      - strong [ref=e10]: www.bing.com
    - generic [ref=e11]:
      - heading "What can you do about it?" [level=3] [ref=e12]
      - paragraph [ref=e13]: Try connecting on a different device. Check your modem or router. Disconnect and reconnect to Wi-Fi.
    - paragraph [ref=e14]:
      - link "Learn more…" [ref=e15] [cursor=pointer]:
        - /url: https://support.mozilla.org/1/firefox/151.0/WINNT/en-US/server-not-found-connection-problem
    - button "Try Again" [ref=e18]:
      - generic [ref=e20]:
        - generic: Try Again
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
> 15 |             await page.goto("https://www.bing.com/");
     |                        ^ Error: page.goto: NS_ERROR_UNKNOWN_HOST
  16 | 
  17 |             await page.fill("textarea[name='q']", data.keyword);
  18 | 
  19 |             await page.keyboard.press("Enter");
  20 | 
  21 |             const firstResult=page.locator("li.b_algo h2 a").first();
  22 | 
  23 |             await expect(firstResult).toBeVisible();
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