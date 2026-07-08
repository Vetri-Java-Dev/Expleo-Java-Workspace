import { HomePage } from './../pages/HomePage';
import { Browser, BrowserContext, Page } from '@playwright/test';
import { setWorldConstructor, World } from '@cucumber/cucumber';
import { RegisterPage } from '../pages/RegisterPage';
import { LoginPage } from '../pages/LoginPage';

export class CustomWorld extends World {

    browser!: Browser
    context!: BrowserContext
    page!: Page

    registerPage! : RegisterPage
    homePage! : HomePage
    loginPage! : LoginPage  
}

setWorldConstructor(CustomWorld)