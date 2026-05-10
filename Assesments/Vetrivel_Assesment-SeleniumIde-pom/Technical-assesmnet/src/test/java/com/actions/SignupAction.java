package com.actions;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.LoginSignUpPage;
import com.pages.SignupPage;

public class SignupAction {

    private SignupPage signupPage;
    private LoginSignUpPage loginSignupPage;
    private HomePage homePage;

    public SignupAction(WebDriver driver) {
        signupPage = new SignupPage(driver);
        loginSignupPage = new LoginSignUpPage(driver);
        homePage = new HomePage(driver);
    }

    public void signUp(String name, String email, String password) {

        homePage.clickSignUpLoginButton();

        loginSignupPage.enterSignupName(name);
        loginSignupPage.enterSignupEmail(email);
        loginSignupPage.clickSignup();

        signupPage.enterPassword(password);
        signupPage.enterFirstName("Vetri");
        signupPage.enterLastName("Vel");
        signupPage.enterAddress("Chennai Address");
        signupPage.selectCountry("India");
        signupPage.enterState("Tamil Nadu");
        signupPage.enterCity("Chennai");
        signupPage.enterZipCode("600001");
        signupPage.enterPhone("9876543210");

        signupPage.clickCreateAccount();
    }
    
    public void login(String email, String password) {
    	
        homePage.clickSignUpLoginButton();
        loginSignupPage.enterLoginEmail(email);
        loginSignupPage.enterLoginPassword(password);
        loginSignupPage.clickLogin();
        
    }
    
    public String getSignupError() {
        return loginSignupPage.getSignupError();
    }

    public String getLoginError() {
        return loginSignupPage.getLoginError();
    }

    public String getLoggedInUserText() {
        return loginSignupPage.getLoggedInUserText();
    }
}