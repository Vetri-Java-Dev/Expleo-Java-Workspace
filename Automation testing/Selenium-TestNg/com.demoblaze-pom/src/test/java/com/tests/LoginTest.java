package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actions.LoginAction;

public class LoginTest extends BaseTest {

	LoginAction loginActions;

	@Test(dataProvider = "testDataForValid", dataProviderClass = DataProviderFromExcel.class)

	public void validLoginTest(String userName, String password) {
		loginActions = new LoginAction(driver);

		loginActions.login(userName, password);

		Assert.assertTrue(loginActions.isWelcomeDisplayed(driver));
	}

	@Test(dataProvider = "testDataForInvalid", dataProviderClass = DataProviderFromExcel.class)

	public void invalidLoginTest(String userName, String password) {
	    loginActions = new LoginAction(driver);

	    loginActions.login(userName, password);

	    String actualMessage = loginActions.alertMessage(driver);

	    Assert.assertTrue(actualMessage.equals("User does not exist.")||actualMessage.equals("Wrong password."));
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}