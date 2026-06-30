import { LoginPage } from '../page/loginPage';
import { HomePage } from './../page/homePage';
import { ContactPage } from '../page/contactPage';
import { ProductPage } from '../page/productPage';
import {test as base, expect} from "@playwright/test"

type Fixtures={
    homePage:HomePage,
    loginPage:LoginPage,
    contactPage: ContactPage;
    productPage: ProductPage;
}

export const test=base.extend<Fixtures>({
    loginPage : async ({page},use) => {
        await use(new LoginPage(page));
    },

    homePage : async({ page },use) => {
        await use(new HomePage(page));
    },

    contactPage: async({page}, use)=>{
        await use(new ContactPage(page));
    },

    productPage: async({page}, use)=>{
        await use(new ProductPage(page));
    }
})

export{expect}