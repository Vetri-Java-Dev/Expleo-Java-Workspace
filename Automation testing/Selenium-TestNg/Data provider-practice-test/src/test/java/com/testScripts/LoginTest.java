package com.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    WebDriver driver = null;

    @Test(dataProvider = "testData", dataProviderClass = DataProviderForPractice.class)
    public void login(String userName, String password) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // click login link
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("customer_login_link"))).click();

        // email field
        WebElement email = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("customer_email")));
        email.sendKeys(userName);

        WebElement passwordField = wait.until(
        	    ExpectedConditions.elementToBeClickable(
        	        By.xpath("//input[@type='password']")
        	    )
        	);
        passwordField.sendKeys(password);

        // sign in button
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@value='Sign In']"))).click();
        
        //WebElement logout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_logout_link")));
        
        String expectedUrl="https://sauce-demo.myshopify.com/account?analytics_trace_id=5f1d07f4-773d-4762-af66-866fabaaa281";
        
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sauce-demo.myshopify.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}