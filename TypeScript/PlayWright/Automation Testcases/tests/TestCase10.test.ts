import { test,expect } from '@playwright/test';

test("Testcase 10 - Verify Subscription in Home Page",async({page})=>{
   
    await page.goto("https://automationexercise.com/")
    await expect(page).toHaveTitle("Automation Exercise")

    await page.locator("//h2[text() = 'Subscription']").scrollIntoViewIfNeeded()
    await expect(page.locator("//h2[text() = 'Subscription']")).toBeVisible()
    
    await page.fill("//input[@id = 'susbscribe_email']", 'bvetrivel@gmail.com')
    await page.click("//button[@id = 'subscribe']")
    await expect(page.getByText("You have been successfully subscribed!")).toBeVisible()
})