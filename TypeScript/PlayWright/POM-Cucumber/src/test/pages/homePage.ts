import { BasePage } from "./basePage";
import {Locator, Page} from "@playwright/test"

export class HomePage extends BasePage{

    readonly productTitle : Locator
    readonly sortDropdown : Locator
    readonly productNames : Locator
    readonly productPrices : Locator

    constructor(page : Page){
        super(page)
        this.productTitle=this.page.locator("//span[@class='title']")
        this.sortDropdown=this.page.locator("//select[@data-test='product-sort-container']")
        this.productNames=this.page.locator("//div[@class='inventory_item_name']")
        this.productPrices=this.page.locator("//div[@class='inventory_item_price']")
    }

    async sortProductsBy(option : string){
        await this.selectOption(this.sortDropdown,option)
    }

    async getProductNames(){
        return await this.getAllTexts(this.productNames)
    }

    async getProductPrices(){
        const priceTexts=await this.getAllTexts(this.productPrices)
        const prices : number[] = []

        for(let i=0;i<priceTexts.length;i++){
            const priceValue=priceTexts[i]!.replace("$","")
            prices.push(parseFloat(priceValue))
        }

        return prices
    }

}