package com.tests;

import org.testng.annotations.DataProvider;
import com.utility.ExcelUtils;

public class DataProviderFromExcel {

    @DataProvider(name = "testDataForInvalid")
    public static Object[][] getInvalidData() {
        return ExcelUtils.readExcel("testDataForDemoBlaze.xlsx", "Sheet1");
    }
    
    @DataProvider(name="testDataForValid")
    public static Object[][] getValidData() {
    	return ExcelUtils.readExcel("testDataForDemoBlaze.xlsx", "Sheet2");
    }
}