package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	By dashboard=By.xpath("//h6");
	
	public String getHomePageTitle() {
		return driver.findElement(dashboard).getText();
	}
}
