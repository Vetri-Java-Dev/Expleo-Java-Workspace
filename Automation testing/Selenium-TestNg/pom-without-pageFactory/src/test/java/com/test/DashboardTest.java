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

public class DashboardTest extends BaseTest{

	private LoginPage loginPage;
	private DashboardPage dashboardPage;

	@Test
	public void DashboardTest() {
		
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);

		loginPage.login("Admin", "admin123");

		Assert.assertEquals(dashboardPage.getHomePageTitle(), "Dashboard");
	}


}
