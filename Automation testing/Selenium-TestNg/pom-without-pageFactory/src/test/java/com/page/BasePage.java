package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BasePage {
  
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
}
