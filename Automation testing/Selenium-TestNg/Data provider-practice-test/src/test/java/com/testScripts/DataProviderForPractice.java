package com.testScripts;

import org.testng.annotations.DataProvider;

import com.utility.ExcelUtil;

public class DataProviderForPractice {
	
	@DataProvider(name="testData")
	public Object[][] getData(){
		return ExcelUtil.readExcel("testData", "Sheet1");
	}
	
}
