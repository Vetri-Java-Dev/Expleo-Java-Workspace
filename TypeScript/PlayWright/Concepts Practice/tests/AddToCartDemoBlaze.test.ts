import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {

  await page.goto('https://www.demoblaze.com/index.html');
  await page.getByRole('link', { name: 'Log in' }).click();

  await page.locator('#loginusername').fill('admin');
  await page.locator('#loginpassword').fill('admin');

  await page.getByRole('button', { name: 'Log in' }).click();
  await page.getByRole('heading', { name: 'Sony vaio i5' }).click();

  page.once('dialog', dialog => {
    console.log(`Dialog message: ${dialog.message()}`);
    dialog.accept().catch(() => {});
  });

  await page.getByRole('link', { name: 'Add to cart' }).click();

  await page.getByRole('link', { name: 'Cart', exact: true }).click();

  await page.getByRole('button', { name: 'Place Order' }).click();
  
  await page.getByRole('textbox', { name: 'Total: 5690 Name:' }).fill('vetri');
  await page.getByRole('textbox', { name: 'Country:' }).fill('india');
  await page.getByRole('textbox', { name: 'City:' }).fill('salem');
  await page.getByRole('textbox', { name: 'Credit card:' }).fill('credit');
  await page.getByRole('textbox', { name: 'Month:' }).fill('3');
  await page.getByRole('textbox', { name: 'Year:' }).fill('5');
  await page.getByRole('button', { name: 'Purchase' }).click();

  await expect(page.locator('.sa-placeholder')).toBeVisible();
});