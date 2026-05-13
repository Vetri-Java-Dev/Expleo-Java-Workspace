package utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static WebDriver driver;

    public static void setDriver(WebDriver driverReference) {
        driver=driverReference;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
