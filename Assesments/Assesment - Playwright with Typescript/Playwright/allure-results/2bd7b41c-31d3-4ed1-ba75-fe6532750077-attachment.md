# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: register.test.ts >> Register test @Smoke >> Valid Registration
- Location: tests\register.test.ts:18:9

# Error details

```
Error: locator.isVisible: Test ended.
Call log:
    - checking visibility of locator('//*[@id=\'content\']/h1')

```

# Test source

```ts
  1  | import {Page} from "@playwright/test"
  2  | 
  3  | export class RegisterPage{
  4  |     readonly page;
  5  |     readonly firstName;
  6  |     readonly lastName;
  7  |     readonly email;
  8  |     readonly password;
  9  |     readonly phone;
  10 |     readonly confirmationPassword;
  11 |     readonly privacyCheck;
  12 |     readonly submit;
  13 |     readonly successMessage;
  14 | 
  15 |     constructor(page : Page){
  16 |         this.page=page
  17 |         this.firstName=page.locator("//input[@id='input-firstname']")
  18 |         this.lastName=page.locator("//input[@id='input-lastname']")
  19 |         this.email=page.locator("//input[@id='input-email']")
  20 |         this.phone=page.locator("//input[@id='input-telephone']")
  21 |         this.password=page.locator("//input[@id='input-password']")
  22 |         this.confirmationPassword=page.locator("//input[@id='input-confirm']")
  23 |         this.privacyCheck=page.locator("//input[@name='agree']")
  24 |         this.submit=page.locator("//input[@value='Continue']")
  25 |         this.successMessage=page.locator("//*[@id='content']/h1")
  26 |     }
  27 | 
  28 |     async register(firstName : string,lastName : string,
  29 |                    email : string,phone : string,
  30 |                    password : string,confirmationPassword : string){
  31 |         
  32 |         await this.firstName.fill(firstName)
  33 |         await this.lastName.fill(lastName)
  34 |         await this.email.fill(email)
  35 |         await this.phone.fill(phone)
  36 |         await this.password.fill(password)
  37 |         await this.confirmationPassword.fill(confirmationPassword)
  38 | 
  39 |         await this.privacyCheck.check()
  40 |         await this.submit.click()  
  41 |     }
  42 | 
  43 |     async isAccountCreated(){
> 44 |         return this.successMessage.isVisible()
     |                                    ^ Error: locator.isVisible: Test ended.
  45 |     }
  46 | 
  47 | }
```