package com.dataProviders;

import org.testng.annotations.DataProvider;
import com.utility.ExcelUtils;

public class DataProviderForSearch {
	
    @DataProvider(name = "validsearch")
    public Object[][] validSearchData() {
        return ExcelUtils.readExcel("Test-Data.xlsx", "validSearch");
    }
    
    @DataProvider(name = "addToCart")
    public Object[][] addToCartData() {
        return ExcelUtils.readExcel("Test-Data.xlsx", "addToCart");
    }
    
}