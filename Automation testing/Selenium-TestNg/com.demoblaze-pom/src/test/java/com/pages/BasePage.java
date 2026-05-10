package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BasePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public BasePage(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		PageFactory.initElements(driver, this);
	}
	
}
