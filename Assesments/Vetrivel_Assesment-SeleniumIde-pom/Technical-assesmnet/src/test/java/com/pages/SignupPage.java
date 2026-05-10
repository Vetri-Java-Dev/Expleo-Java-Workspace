package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage {

    private WebDriverWait wait;

    public SignupPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By signupPassword=By.id("password");
    By firstName=By.id("first_name");
    By lastName=By.id("last_name");
    By phone=By.id("mobile_number");
    By address=By.id("address1");
    By countryDropDown=By.id("country");
    By state=By.id("state");
    By city=By.id("city");
    By zipCode=By.id("zipcode");
    
    By createAccount=By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");

    private WebElement waitForElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void enterPassword(String password) {
        waitForElement(signupPassword)
        .sendKeys(password);
    }

    public void enterFirstName(String fName) {
        waitForElement(firstName)
        .sendKeys(fName);
    }

    public void enterLastName(String lName) {
        waitForElement(lastName)
        .sendKeys(lName);
    }

    public void enterPhone(String mobile) {
        waitForElement(phone)
        .sendKeys(mobile);
    }

    public void enterAddress(String addr) {
        waitForElement(address)
        .sendKeys(addr);
    }

    public void selectCountry(String countryName) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(countryDropDown));
        Select select=new Select(dropdown);
        select.selectByVisibleText(countryName);
    }

    public void enterState(String stateName) {
        waitForElement(state)
        .sendKeys(stateName);
    }

    public void enterCity(String cityName) {
        waitForElement(city)
        .sendKeys(cityName);
    }

    public void enterZipCode(String zip) {
        waitForElement(zipCode)
        .sendKeys(zip);
    }
    
    public void clickCreateAccount() {
    	wait.until(ExpectedConditions.elementToBeClickable(createAccount))
    	.click();
    }
}