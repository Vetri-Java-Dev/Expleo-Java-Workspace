# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: AddToCartDemoBlaze.test.ts >> test
- Location: tests\AddToCartDemoBlaze.test.ts:3:5

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: locator.fill: Test timeout of 30000ms exceeded.
Call log:
  - waiting for getByRole('textbox', { name: 'Total: 5690 Name:' })

```

# Page snapshot

```yaml
- generic [ref=e1]:
  - dialog "Place order" [active] [ref=e2]:
    - document [ref=e3]:
      - generic [ref=e4]:
        - generic [ref=e5]:
          - heading "Place order" [level=5] [ref=e6]
          - button "Close" [ref=e7] [cursor=pointer]: ×
        - generic [ref=e9]:
          - generic [ref=e10]: "Total:"
          - generic [ref=e11]:
            - generic [ref=e12]: "Name:"
            - 'textbox "Total: Name:" [ref=e13]'
          - generic [ref=e14]:
            - generic [ref=e15]: "Country:"
            - textbox "Country:" [ref=e16]
          - generic [ref=e17]:
            - generic [ref=e18]: "City:"
            - textbox "City:" [ref=e19]
          - generic [ref=e20]:
            - generic [ref=e21]: "Credit card:"
            - textbox "Credit card:" [ref=e22]
          - generic [ref=e23]:
            - generic [ref=e24]: "Month:"
            - textbox "Month:" [ref=e25]
          - generic [ref=e26]:
            - generic [ref=e27]: "Year:"
            - textbox "Year:" [ref=e28]
        - generic [ref=e30]:
          - button "Close" [ref=e31]
          - button "Purchase" [ref=e32]
  - text:             
  - navigation [ref=e33]:
    - generic [ref=e34]:
      - link "PRODUCT STORE" [ref=e35] [cursor=pointer]:
        - /url: index.html
        - img [ref=e36]
        - text: PRODUCT STORE
      - list [ref=e38]:
        - listitem [ref=e39]:
          - link "Home (current)" [ref=e40] [cursor=pointer]:
            - /url: index.html
            - text: Home
            - generic [ref=e41]: (current)
        - listitem [ref=e42]:
          - link "Contact" [ref=e43] [cursor=pointer]:
            - /url: "#"
        - listitem [ref=e44]:
          - link "About us" [ref=e45] [cursor=pointer]:
            - /url: "#"
        - listitem [ref=e46]:
          - link "Cart" [ref=e47] [cursor=pointer]:
            - /url: "#"
        - listitem
        - listitem [ref=e48]:
          - link "Log out" [ref=e49] [cursor=pointer]:
            - /url: "#"
        - listitem [ref=e50]:
          - link "Welcome admin" [ref=e51] [cursor=pointer]:
            - /url: "#"
        - listitem
  - generic [ref=e53]:
    - generic [ref=e54]:
      - heading "Products" [level=2] [ref=e55]
      - table [ref=e57]:
        - rowgroup [ref=e58]:
          - row "Pic Title Price x" [ref=e59]:
            - columnheader "Pic" [ref=e60]
            - columnheader "Title" [ref=e61]
            - columnheader "Price" [ref=e62]
            - columnheader "x" [ref=e63]
        - rowgroup
    - generic [ref=e64]:
      - heading "Total" [level=2] [ref=e65]
      - generic:
        - generic:
          - heading [level=3]
      - button "Place Order" [ref=e66]
  - generic [ref=e68]:
    - generic [ref=e71]:
      - heading "About Us" [level=4] [ref=e72]
      - paragraph [ref=e73]: We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.
    - generic [ref=e76]:
      - heading "Get in Touch" [level=4] [ref=e77]
      - paragraph [ref=e78]: "Address: 2390 El Camino Real"
      - paragraph [ref=e79]: "Phone: +440 123456"
      - paragraph [ref=e80]: "Email: demo@blazemeter.com"
    - heading "PRODUCT STORE" [level=4] [ref=e84]:
      - img [ref=e85]
      - text: PRODUCT STORE
  - contentinfo [ref=e86]:
    - paragraph [ref=e87]: Copyright © Product Store
```

# Test source

```ts
  1  | import { test, expect } from '@playwright/test';
  2  | 
  3  | test('test', async ({ page }) => {
  4  | 
  5  |   await page.goto('https://www.demoblaze.com/index.html');
  6  |   await page.getByRole('link', { name: 'Log in' }).click();
  7  | 
  8  |   await page.locator('#loginusername').fill('admin');
  9  |   await page.locator('#loginpassword').fill('admin');
  10 | 
  11 |   await page.getByRole('button', { name: 'Log in' }).click();
  12 |   await page.getByRole('heading', { name: 'Sony vaio i5' }).click();
  13 | 
  14 |   page.once('dialog', dialog => {
  15 |     console.log(`Dialog message: ${dialog.message()}`);
  16 |     dialog.dismiss().catch(() => {});
  17 |   });
  18 | 
  19 |   await page.getByRole('link', { name: 'Add to cart' }).click();
  20 | 
  21 |   await page.getByRole('link', { name: 'Cart', exact: true }).click();
  22 | 
  23 |   await page.getByRole('button', { name: 'Place Order' }).click();
  24 |   
> 25 |   await page.getByRole('textbox', { name: 'Total: 5690 Name:' }).fill('vetri');
     |                                                                  ^ Error: locator.fill: Test timeout of 30000ms exceeded.
  26 |   await page.getByRole('textbox', { name: 'Country:' }).fill('india');
  27 |   await page.getByRole('textbox', { name: 'City:' }).fill('salem');
  28 |   await page.getByRole('textbox', { name: 'Credit card:' }).fill('credit');
  29 |   await page.getByRole('textbox', { name: 'Month:' }).fill('3');
  30 |   await page.getByRole('textbox', { name: 'Year:' }).fill('5');
  31 |   await page.getByRole('button', { name: 'Purchase' }).click();
  32 |   
  33 |   await expect(page.locator('.sa-placeholder')).toBeVisible();
  34 | });
```