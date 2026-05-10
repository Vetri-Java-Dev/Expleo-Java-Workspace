package com.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class DashboardAction {
	
	private static DashboardPage dashboardPage;
	
	public DashboardAction(WebDriver driver) {
		dashboardPage = new DashboardPage(driver);
    }
	
	public boolean isDashboardVisible() {
		return new WebDriverWait(
				dashboardPage.getDriver(),
				Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOfElementLocated(dashboardPage.getDashBoard()))
		.isDisplayed();
	}
	
	public int noOfWidgets() {
		return dashboardPage.getWidgets().size();
	}
}
