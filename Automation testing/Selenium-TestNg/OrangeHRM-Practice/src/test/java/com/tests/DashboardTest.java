package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actions.DashboardAction;

public class DashboardTest extends BaseTest {
	
	@Test(dependsOnMethods="com.tests.LoginTest.loginTest")
	public void dashBoardVisibility() {
		DashboardAction action=new DashboardAction(driver);
		Assert.assertTrue(action.isDashboardVisible());
	}
	
	@Test(dependsOnMethods="dashBoardVisibility")
	public void dashboardWidgets() {
		DashboardAction action=new DashboardAction(driver);
		Assert.assertTrue(action.noOfWidgets()>=1);
	}

}
