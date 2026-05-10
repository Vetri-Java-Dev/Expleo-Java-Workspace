package com.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actions.SignupAction;
import com.listeners.ListenerForAutomationExercise;

@Listeners(ListenerForAutomationExercise.class)
public class AuthTest extends BaseTest {

    private SignupAction signupAction;

    @BeforeMethod
    public void init() {
        signupAction = new SignupAction(getDriver());
    }

    @Test(dataProvider = "signupData", dataProviderClass = com.dataProviders.DataProviderForSignUp.class)
    public void registerNewUser(String name, String email, String password) {
        signupAction.signUp(name, email, password);
        Assert.assertTrue(getDriver().findElement(By.xpath("//h2[contains(text(),'ACCOUNT CREATED')]")).isDisplayed());
    }

    @Test(dataProvider = "existingEmailData", dataProviderClass = com.dataProviders.DataProviderForSignUp.class)
    public void registerWithExistingEmail(String name, String email, String password) {
        signupAction.signUp(name, email, password);
        Assert.assertTrue(signupAction.getSignupError().contains("Email Address already exist"));
    }

    @Test(dataProvider = "validLoginData", dataProviderClass = com.dataProviders.DataProviderForSignUp.class)
    public void loginValidUser(String email, String password) {
        signupAction.login(email, password);
        Assert.assertTrue(signupAction.getLoggedInUserText().contains("Logged in as"));
    }

    @Test(dataProvider = "invalidLoginData", dataProviderClass = com.dataProviders.DataProviderForSignUp.class)
    public void loginInvalidUser(String email, String password) {
        signupAction.login(email, password);
        Assert.assertEquals(signupAction.getLoginError(), "Your email or password is incorrect!");
    }
}