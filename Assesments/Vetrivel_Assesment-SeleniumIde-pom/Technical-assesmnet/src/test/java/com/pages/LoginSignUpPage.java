package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSignUpPage extends BasePage {

	public LoginSignUpPage(WebDriver driver) {
		super(driver);
	}

	By signupName = By.xpath("//input[@data-qa='signup-name']");
	By signupEmail = By.xpath("//input[@data-qa='signup-email']");
	By signupButton = By.xpath("//button[@data-qa='signup-button']");

	By loginEmail = By.xpath("//input[@data-qa='login-email']");
	By loginPassword = By.xpath("//input[@data-qa='login-password']");
	By loginButton = By.xpath("//button[@data-qa='login-button']");

	By signupError = By.xpath("//p[contains(text(),'already')]");
	By loginError = By.xpath("//p[contains(text(),'incorrect')]");
	By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");

	public void enterSignupName(String name) {
		safeType(signupName, name);
	}

	public void enterSignupEmail(String email) {
		safeType(signupEmail, email);
	}

	public void clickSignup() {
		safeClick(signupButton);
	}

	public void enterLoginEmail(String email) {
		safeType(loginEmail, email);
	}

	public void enterLoginPassword(String password) {
		safeType(loginPassword, password);
	}

	public void clickLogin() {
		safeClick(loginButton);
	}

	public String getSignupError() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(signupError))
				.getText();
	}

	public String getLoginError() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loginError))
				.getText();
	}

	public String getLoggedInUserText() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInUser))
				.getText();
	}
}