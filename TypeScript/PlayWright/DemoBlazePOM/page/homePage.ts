import {Page, Locator} from "@playwright/test"

export class HomePage{
    readonly page : Page;
    readonly login : Locator;
    readonly logout : Locator;
    readonly contactLink: Locator;
    readonly samsungGalaxyS6: Locator;

    constructor(page : Page){
        this.page=page
        this.login=page.locator("//a[@id='login2']")
        this.contactLink = page.locator('//a[text()="Contact"]');
        this.logout=page.locator("//*[@id='logout2']")
        this.samsungGalaxyS6 = page.locator('//a[text()="Samsung galaxy s6"]');
    }

    async navigateToHome(){
        await this.page.goto("/", {
        waitUntil: "domcontentloaded"
    });
    }

    async clickLogin(){
        await this.login.click()
    }

    async isLogoutVisible(){
        this.logout.isVisible()
    }
    async openContactPage() {
        await this.contactLink.click();
    }
    async openSamsungGalaxyS6() {
        await this.samsungGalaxyS6.click();
    }
}
