import {test,expect} from "@playwright/test"

test("Checkbox demo",async({page})=>{
    await page.goto("https://omayo.blogspot.com/")

    await page.click("//button[normalize-space()='Check this']")

    //check
    await page.check("//input[@id='dte']")

    //toBeChecked
    await expect(page.locator("//input[@id='dte']")).toBeChecked()

    //uncheck 
    await page.uncheck("//input[@id='dte']")
    await expect(page.locator("//input[@id='dte']")).not.toBeChecked()

    
})

test('Radio button Demo',async({page})=>{
    await page.goto("https://omayo.blogspot.com/");

    await page.locator('#radio2').check();
    await page.locator('#checkbox1').check();
    await page.locator('#checkbox2').check();
    await page.locator('#checkbox2').uncheck();

    await page.selectOption('#multiselect1',[ { value: 'volvox' },{ value: 'swiftx' },{ value: 'audix' }]);
    await page.selectOption('#drop1', { value: 'def' });

});