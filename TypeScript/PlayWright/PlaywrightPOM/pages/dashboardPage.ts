import {Page, Locator} from "@playwright/test"

export class DashboardPage{
    
    readonly page : Page;
    readonly dashboardTitle : Locator;
    readonly timeAtWorkCard : Locator;
    readonly quickLaunch : Locator;
    readonly profileMenu : Locator;
    readonly logout : Locator


    constructor(page : Page){
        this.page=page;

        this.dashboardTitle=page.locator("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
        this.timeAtWorkCard=page.locator("//p[normalize-space()='Time at Work']")
        this.profileMenu=page.locator("//p[@class='oxd-userdropdown-name']")
        this.logout=page.locator("//a[normalize-space()='Logout']")
        this.quickLaunch=page.locator("//p[normalize-space()='Quick Launch']")
    }

    async Logout(){
        await this.profileMenu.click()
        await this.logout.click()
    }

}

