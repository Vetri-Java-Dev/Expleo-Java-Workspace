package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By login = By.id("login2");
    By userName = By.id("loginusername");
    By password = By.id("loginpassword");
    By submit = By.xpath("//button[text()='Log in']");
    By loginModal = By.id("logInModal");
    By welcome=By.id("nameofuser");
    
    public void clickLogin() {

    		boolean isModalDisplayed = driver.findElement(loginModal).isDisplayed();

        if (!isModalDisplayed) {
            WebElement loginBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(login));

            loginBtn.click();
        }
    }

    public void enterUserName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(name);
    }

    public void enterPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
    }

    public void clickSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        driver.findElement(submit).click();
    }

    
	public By getLogin() {
		return login;
	}

	public void setLogin(By login) {
		this.login = login;
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

	public By getLoginModal() {
		return loginModal;
	}

	public void setLoginModal(By loginModal) {
		this.loginModal = loginModal;
	}

	public By getWelcome() {
		return welcome;
	}

	public void setWelcome(By welcome) {
		this.welcome = welcome;
	}
    
}