package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="search")
    WebElement searchField;

    @FindBy(xpath="//button[contains(@class,'btn-default')]")
    WebElement searchButton;

    public void enterProduct(String product) {
        searchField.sendKeys(product);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public boolean isNoProductMessageDisplayed() {
        return driver.findElements(By.xpath("//p[contains(text(),'There is no product')]")).size()>0;
    }
    
    public boolean isProductDisplayed() {
        return driver.findElements(By.xpath("//div[@class='product-thumb']")).size() > 0;
    }

}
