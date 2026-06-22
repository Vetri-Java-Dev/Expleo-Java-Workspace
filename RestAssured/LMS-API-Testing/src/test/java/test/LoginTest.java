package test;

import datafactory.LoginDataFactory;
import model.LoginRequest;
import service.LoginService;
import utility.TokenManager;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class LoginTest {

    @Test(dataProvider = "validLoginData",
          dataProviderClass = LoginDataFactory.class)
    public void validLoginTest(String email, String password) {

        LoginRequest request = new LoginRequest(email, password);
        Response response = LoginService.login(request);

        response.then().statusCode(201);

        String token = response.jsonPath().getString("token");

        Assert.assertNotNull(token);
        TokenManager.setToken(token);
    }

    @Test(dataProvider = "invalidLoginData",
          dataProviderClass = LoginDataFactory.class)
    public void invalidLoginTest(String testCase,
                                 String email,
                                 String password) {

        String finalEmail = (email != null && !email.isBlank()) ? email : null;
        String finalPassword = (password != null && !password.isBlank()) ? password : null;

        LoginRequest request = new LoginRequest(finalEmail, finalPassword);
        Response response = LoginService.login(request);

        int status = response.getStatusCode();

        Assert.assertTrue(status == 400 || status == 401 || status == 422,
                "Unexpected status code: " + status);

        String actualMessage = response.jsonPath().getString("message[0].value");

        Assert.assertTrue(actualMessage!=null);
    }
}