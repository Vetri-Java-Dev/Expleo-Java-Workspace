import {When, Then} from "@cucumber/cucumber"
import { CustomWorld } from "../world/CustomWorld";
import {expect} from "@playwright/test"

When('User sorts products by {string}', async function (this:CustomWorld,option:string) {
    await this.logger.info("User sorting products by "+option)
    await this.homePage.sortProductsBy(option)
});

Then('products should be sorted in {string} order by {string}', async function (this:CustomWorld,order:string,field:string) {

    if(field==="name"){
        const names=await this.homePage.getProductNames()
        const expectedNames=[...names]

        if(order==="ascending"){
            expectedNames.sort()
        }
        else if(order==="descending"){
            expectedNames.sort().reverse()
        }

        let isSorted=true

        for(let i=0;i<names.length;i++){
            if(names[i]!==expectedNames[i]){
                isSorted=false
            }
        }

        await this.logger.info("Products sorted by name in "+order+" order : "+isSorted)
        expect(isSorted).toBeTruthy()
    }
    else if(field==="price"){
        const prices=await this.homePage.getProductPrices()
        const expectedPrices=[...prices]

        if(order==="ascending"){
            expectedPrices.sort(function(a,b){return a-b})
        }
        else if(order==="descending"){
            expectedPrices.sort(function(a,b){return b-a})
        }

        let isSorted=true

        for(let i=0;i<prices.length;i++){
            if(prices[i]!==expectedPrices[i]){
                isSorted=false
            }
        }

        await this.logger.info("Products sorted by price in "+order+" order : "+isSorted)
        expect(isSorted).toBeTruthy()
    }
});