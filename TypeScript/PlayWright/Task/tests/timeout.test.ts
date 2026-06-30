import { test, expect } from "@playwright/test";


test("Timeout demonstration", async ({page})=>{

    test.setTimeout(15000);

    //Navigation timeout
    await page.goto("https://www.demoblaze.com/",{timeout:5000});

    //Action timeout
    await page.locator("#login2").click({timeout:3000});

    //Assertion timeout:
    await expect(page.locator("#logInModal")).toBeVisible({timeout:5000});


});