package com.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.ExcelUtil;

public class DataProviderForOrangeHRM {

	@DataProvider(name="invalidUsername")
	public Object[][] getInvalidUserNameData(){
		return ExcelUtil.readExcel("OrangeHRM-TestData.xlsx","invalidUsername");
	}
	
	@DataProvider(name="invalidPassword")
	public Object[][] getInvalidPasswordData(){
		return ExcelUtil.readExcel("OrangeHRM-TestData.xlsx","invalidPassword");
	}
}
