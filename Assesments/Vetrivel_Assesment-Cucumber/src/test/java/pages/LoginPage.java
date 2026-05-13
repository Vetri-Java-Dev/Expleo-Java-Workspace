package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[text()='My Account']")
    WebElement myAccount;

    @FindBy(linkText="Login")
    WebElement loginOption;

    @FindBy(id="input-email")
    WebElement email;

    @FindBy(id="input-password")
    WebElement password;

    @FindBy(xpath="//input[@value='Login']")
    WebElement loginBtn;

    public void navigateToLoginPage() {
        myAccount.click();
        loginOption.click();
    }

    public void login(String userEmail, String userPassword) {
        email.sendKeys(userEmail);
        password.sendKeys(userPassword);
        loginBtn.click();
    }
}