package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By userName=By.name("username");
	By password=By.name("password");
	By submit=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	By invalidCredentialBy=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]");
	
	By userNameRequired=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
	By passwordRequired=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
		
	public void enterUserName(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(name);
	}
	
	public void enterPassword(String Password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(Password);
	}
	
	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
	}

	public By getUserName() {
		return userName;
	}

	public void setUserName(By userName) {
		this.userName = userName;
	}

	public By getPassword() {
		return password;
	}

	public void setPassword(By password) {
		this.password = password;
	}

	public By getSubmit() {
		return submit;
	}

	public void setSubmit(By submit) {
		this.submit = submit;
	}

	public By getInvalidCredentialBy() {
		return invalidCredentialBy;
	}

	public void setInvalidCredentialBy(By invalidCredentialBy) {
		this.invalidCredentialBy = invalidCredentialBy;
	}

	public By getUserNameRequired() {
		return userNameRequired;
	}

	public void setUserNameRequired(By userNameRequired) {
		this.userNameRequired = userNameRequired;
	}

	public By getPasswordRequired() {
		return passwordRequired;
	}

	public void setPasswordRequired(By passwordRequired) {
		this.passwordRequired = passwordRequired;
	}

}
