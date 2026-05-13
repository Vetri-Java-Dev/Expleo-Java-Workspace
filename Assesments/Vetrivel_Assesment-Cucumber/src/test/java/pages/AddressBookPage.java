package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressBookPage {

    WebDriver driver;
    WebDriverWait wait;

    public AddressBookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(linkText="Address Book")
    WebElement addressBookLink;

    @FindBy(xpath="//a[contains(text(),'New Address')]")
    WebElement newAddressButton;

    @FindBy(id="input-firstname")
    WebElement firstNameField;

    @FindBy(id="input-lastname")
    WebElement lastNameField;

    @FindBy(id="input-address-1")
    WebElement addressField;

    @FindBy(id="input-city")
    WebElement cityField;

    @FindBy(id="input-postcode")
    WebElement postcodeField;

    @FindBy(id="input-country")
    WebElement countryDropdown;

    @FindBy(id="input-zone")
    WebElement regionDropdown;

    @FindBy(xpath="//input[@value='Continue']")
    WebElement continueButton;

    @FindBy(xpath="//div[contains(@class,'alert-success')]")
    WebElement successMessage;

    public void clickAddressBook() {
        wait.until(ExpectedConditions.elementToBeClickable(addressBookLink));
        addressBookLink.click();
    }

    public void clickNewAddress() {
        wait.until(ExpectedConditions.elementToBeClickable(newAddressButton));
        newAddressButton.click();
    }

    public void addAddress(String firstName,String lastName,String address,String city,String postcode,String country,String region) {
        
    		firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        addressField.sendKeys(address);
        cityField.sendKeys(city);
        postcodeField.sendKeys(postcode);

        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText(country);

        wait.until(ExpectedConditions.elementToBeClickable(regionDropdown));

        Select regionSelect = new Select(regionDropdown);
        regionSelect.selectByVisibleText(region);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public boolean isAddressAdded() {
        return wait.until(ExpectedConditions.visibilityOf(successMessage)).isDisplayed();
    }
}