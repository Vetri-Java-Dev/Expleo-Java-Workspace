package com.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OverlayUtil {

    public static void handleAdIfPresent(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

            WebElement closeBtn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[text()='Close' or contains(text(),'close') or contains(text(),'×')]")
                )
            );

            closeBtn.click();

        }
        catch (Exception ignored) {}
    }
}