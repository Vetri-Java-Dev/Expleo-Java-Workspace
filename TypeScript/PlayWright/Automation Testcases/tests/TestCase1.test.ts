import { test,chromium,expect,Page,Browser } from '@playwright/test';

test("Testcase 1 - Register User",async({page})=>{
   
    await page.goto("https://automationexercise.com/")

    await page.click("//a[normalize-space()='Signup / Login']");

    await page.fill("//input[@placeholder='Name']","Vetri")
    await page.fill("//input[@data-qa='signup-email']","bvetrivel@gmail.com1000")

    await page.click("//button[normalize-space()='Signup']")

    await page.fill("//input[@id='password']","Vetri@12345")

    await page.fill("//input[@id='first_name']","Vetri")
    await page.fill("//input[@id='last_name']","b")

    await page.fill("//input[@id='state']","TamilNadu")
    await page.fill("//input[@id='city']","salem")

    await page.fill("//input[@id='address1']","address")
    await page.fill("//input[@id='zipcode']","611222104")

    await page.fill("//input[@id='mobile_number']","7896541230")

    await page.click("//button[normalize-space()='Create Account']")

    await expect("//b[normalize-space()='Account Created!']").toContain("Created")

});