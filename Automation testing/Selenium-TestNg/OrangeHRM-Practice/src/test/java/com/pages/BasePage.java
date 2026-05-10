package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BasePage {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
