import {
  Before,
  After,
  BeforeAll,
  AfterAll,
  Status,
  setDefaultTimeout
} from "@cucumber/cucumber";
import { Browser, chromium } from "@playwright/test";
import { CustomWorld } from "../world/customworld";
import { RegisterPage } from "../pages/RegisterPage";
import { HomePage } from "../pages/HomePage";
import { LoginPage } from "../pages/LoginPage";

let browser: Browser;

setDefaultTimeout(60 * 1000);

BeforeAll(async () => {
  browser = await chromium.launch({ headless: false });
});

Before(async function (this: CustomWorld) {
  this.browser = browser;
  this.context = await browser.newContext();
  this.page = await this.context.newPage();

  this.registerPage = new RegisterPage(this.page);
  this.homePage = new HomePage(this.page);
  this.loginPage = new LoginPage(this.page);
});

After(async function (this: CustomWorld, { pickle, result }) {
    let status : string

    if(result?.status===Status.PASSED){
        status="passed"
    }
    else{
        status="failed"
    }

    await this.page.screenshot({path: `reports/screenshots/${pickle.name}_${status}_${Date.now()}.png`,});

    await this.page.close();
    await this.context.close();
});

AfterAll(async () => {
  await browser.close();
});