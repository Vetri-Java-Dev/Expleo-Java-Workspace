package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By userName=By.name("username");
	By password=By.name("password");
	
	By loginText=By.xpath("//h5");
	By loginButton=By.xpath("//button[text()=\" Login \"]");
	
	public void setUserName(String name) {
		driver.findElement(userName).sendKeys(name);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public String getLoginText() {
		return driver.findElement(loginText).getText();
	}
	
	public void login(String strUserName,String strPassword) {
		setUserName(strUserName);
		setPassword(strPassword);
		clickLogin();
	}
	
	
}
