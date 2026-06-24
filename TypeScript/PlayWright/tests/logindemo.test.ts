import {test, expect} from '@playwright/test'
import dotenv from 'dotenv'

dotenv.config()

test("Login Test",async({page})=>{

    await page.goto(process.env.BASE_URL!)

    await page.fill("#username",process.env.USER_NAME!)
    await page.fill("#password",process.env.PASSWORD!)

    await page.click("#login > button")

    await expect(page.locator("#flash")).toBeVisible()
    
})