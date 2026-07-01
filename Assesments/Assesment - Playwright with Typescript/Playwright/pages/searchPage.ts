import {Page} from "@playwright/test"

export class SearchPage{

    readonly page;
    readonly searchInput;
    readonly searchButton;
    readonly productTitles;
    readonly pageHeading;

    constructor(page : Page){
        this.page=page
        this.searchInput=page.locator("//input[@name='search']")
        this.searchButton=page.locator("//div[@class='input-group']//button")
        this.productTitles=page.locator("//div[@class='product-thumb']//h4/a")
        this.pageHeading=page.locator("//*[@id='content']/h1")
    }

    async searchProduct(keyword : string){
        await this.searchInput.fill(keyword)
        await this.searchButton.click()
    }

    async getProductTitles(): Promise<string[]>{
        return await this.productTitles.allTextContents()
    }

    async getResultsCount(): Promise<number>{
        return await this.productTitles.count()
    }

}