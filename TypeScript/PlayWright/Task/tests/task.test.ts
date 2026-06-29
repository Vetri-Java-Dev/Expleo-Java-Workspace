import { test, expect } from '@playwright/test';

test("Task 1 - Input verification", async ({ page }) => {

    await page.goto("https://www.testmuai.com/selenium-playground/simple-form-demo/");

    console.log(await page.locator("input#user-message").getAttribute("placeholder"));

    await page.locator("input#user-message").fill("Vetrivel");
 
    console.log(await page.locator("input#user-message").inputValue());

    await expect(page.locator("input#user-message")).toHaveValue("Vetrivel");

    // await page.click("#showInput");

    // await expect(page.locator("#message")).toHaveText("Vetrivel");

});

test("Task 2 - Sum of two numbers",async({page})=>{

    await page.goto("https://www.testmuai.com/selenium-playground/simple-form-demo/",{
        waitUntil:'networkidle'

    })

    const a=15
    const b=15

    const result=a+b

    await page.fill("//input[@id='sum1']",""+a)
    await page.fill("//input[@id='sum2']",""+b)

    await page.click("//*[@id='gettotal']/button")
    
    console.log(await page.locator("//*[@id='gettotal']/button").boundingBox())
    await expect(page.locator("//p[@id='addmessage']")).toHaveText(""+result,{ timeout: 5000 })

})

test("Task 3 - Simple Alert handling",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")

    let actual=""

    page.once("dialog",async(alert)=>{
        console.log(alert.message())
        actual=alert.message()  
        alert.accept()
        console.log("Alert accepted")
    })

    await page.click("//*[@id='__next']/div/main/section[2]/div/div/div/div[1]/p/button")

    await expect(actual,"I am an alert box!")
})

test("Task 4 - Confirmation Alert handling",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")

    let actual=""

    page.once("dialog",async(alert)=>{
        console.log(alert.message())
        actual=alert.message()  
        alert.dismiss()
        console.log("Alert dismissed")
    })

    await page.waitForTimeout(5000)
    await page.click("//p[@class='text-gray-900 text-size-16 mt-10 text-black font-bold']//button[@type='button'][normalize-space()='Click Me']")

    await expect(actual,"Press a button!")
    await expect(page.locator("//p[@id='confirm-demo']")).toHaveText("You pressed Cancel!")
})


test("Task 5 - Prompt Alert handling",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")

    let actual=""

    page.once("dialog",async(alert)=>{
        console.log(alert.message())
        actual=alert.message()  
        alert.accept("Vetrivel")
        console.log("Alert accepted")
    })

    await page.waitForTimeout(5000)
    await page.click("//div[3]//p[1]//button[1]")

    await expect(actual,"Please enter your name")
    console.log(await page.locator("//p[@id='prompt-demo']").textContent())
    await expect(page.locator("//p[@id='prompt-demo']")).toHaveText("You have entered 'Vetrivel' !")
})

test("Task 6 - Select Drop Down",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/select-dropdown-demo/")

    await page.selectOption("//select[@id='select-demo']",{
        label : "Friday"
    })

    await page.waitForTimeout(10000)
    // await page.selectOption("//option[@value='California']",{
    //     label : "Florida",
    //     label : "New York"
    // })

    await expect(page.locator("//p[@class='selected-value text-size-14']")).toContainText("Friday")
    
})

test("Task 7 - Multi Select on Drop Down",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/select-dropdown-demo/")
    
    await page.waitForTimeout(10000)
    await page.selectOption("#multi-select",[
        {label : "Florida"},
        {index : 2}
    ])

    await page.waitForTimeout(10000)

    // await page.click("//button[@id='printMe']")
    // await expect()
})

test("Task 8 - Frame handling",async({page})=>{

    await page.goto("https://letcode.in/frame")

    const frames=page.frames()

    console.log("Frame Count : ",frames.length)

    const myFrame=page.frame("firstFr")

    await myFrame?.fill("input[name='fname']","Vetrivel")
    await myFrame?.fill("input[name='lname']","B")

    await expect(myFrame?.locator("//p[@class='text-sm font-semibold text-center']").textContent(),"You have entered Vetrivel B")

    const innerFrame = myFrame?.frameLocator("iframe[src='/innerframe']");
    await innerFrame?.locator("input[name='email']").fill("Vetri@gmail.com");
})

test("Task 9 - Window Handling",async({context,page})=>{

    await page.goto("https://demoqa.com/browser-windows")

    console.log("Current Page Url : ", page.url())

    const [newWindow]=await Promise.all([
        context.waitForEvent("page"),
        page.locator("//button[@id='windowButton']").click()
    ])

    await newWindow.waitForLoadState("domcontentloaded")

    console.log("New Window Url : ", newWindow.url())

    console.log(newWindow.locator("//h1[@id='sampleHeading']").textContent())
    await expect(newWindow.locator("//h1[@id='sampleHeading']")).toHaveText("This is a sample page")

    await newWindow.close()

    console.log(page.url())

})

test("Task 10 - Iterative Windows",async({page,context})=>{

    await page.goto("https://demoqa.com/browser-windows")

    console.log("Current Page Url : ", page.url())

    const [newWindow]=await Promise.all([
        context.waitForEvent("page"),
        page.locator("//button[@id='windowButton']").click()
    ])

    await newWindow.waitForLoadState("domcontentloaded")

    const [tab]=await Promise.all([
        context.waitForEvent("page"),
        page.locator("//button[@id='tabButton']").click()
    ])

    await newWindow.waitForLoadState("domcontentloaded")

    const [window]=await Promise.all([
        context.waitForEvent("page"),
        page.locator("//button[@id='messageWindowButton']").click()
    ])

    await window.waitForLoadState()

    const pages=context.pages()

    console.log("No of pages : ",pages.length)

    for(const Page of pages){
        console.log("\n")
        console.log("Url : ",Page.url())
        console.log("Title : ",await page.title())
    }
})


