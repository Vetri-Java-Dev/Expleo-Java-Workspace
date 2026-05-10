package com.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.LoginPage;

public class LoginAction {
	
	private LoginPage loginPage;
	
	public LoginAction(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }
	
	public void login(String userName,String password) {
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}
	
	public boolean isInvalidCredentialDisplayed() {
		return new WebDriverWait(loginPage.getDriver(),Duration.ofSeconds(15))
		.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getInvalidCredentialBy()))
		.isDisplayed();
	}
	
}
