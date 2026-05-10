package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.page.DashboardPage;
import com.page.LoginPage;

public class LoginTest extends BaseTest{

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	@Test
	public void loginTest() {

		loginPage = new LoginPage(driver);

		Assert.assertEquals(loginPage.getLoginText(),"Login");
	}

}
