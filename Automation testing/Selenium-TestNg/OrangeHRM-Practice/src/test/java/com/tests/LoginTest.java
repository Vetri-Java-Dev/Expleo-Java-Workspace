package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actions.DashboardAction;
import com.actions.LoginAction;

public class LoginTest extends BaseTest {

	LoginAction loginAction;
	DashboardAction dashBoardAction;
	
	@BeforeMethod
	public void actionsSetUp() {
		loginAction=new LoginAction(driver);
		dashBoardAction=new DashboardAction(driver);
	}
	@Test(enabled=false)
	public void validLoginTest() {
		loginAction.login("Admin", "admin123");

		Assert.assertTrue(dashBoardAction.isDashboardVisible());
	}
	
	@Test(dataProvider="invalidUsername",dataProviderClass=DataProviderForOrangeHRM.class)
	public void invalidCredentialTest(String userName,String password) {
		loginAction.login(userName, password);
		Assert.assertTrue(loginAction.isInvalidCredentialDisplayed());
	}

}
