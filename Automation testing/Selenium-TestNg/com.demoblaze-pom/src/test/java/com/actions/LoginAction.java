package com.actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.LoginPage;

public class LoginAction {

	private LoginPage loginPage;

	public LoginAction(WebDriver driver) {
		loginPage = new LoginPage(driver);
	}

	public void login(String userName, String password) {
		loginPage.clickLogin();
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		loginPage.clickSubmit();
	}

	public boolean isWelcomeDisplayed(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOfElementLocated(loginPage.getWelcome())).getText().toLowerCase()
				.contains("welcome");
	}

    public String alertMessage(WebDriver driver) {

        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        String message = alert.getText();

        alert.accept();

        return message;
    }

}