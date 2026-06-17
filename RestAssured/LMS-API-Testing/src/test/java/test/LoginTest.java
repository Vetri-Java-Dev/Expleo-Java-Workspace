package test;

import model.LoginRequest;
import service.LoginService;
import utility.ConfigReader;
import utility.TokenManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class LoginTest {

    @Test
    public void validLoginTest() {

        LoginRequest request=new LoginRequest(ConfigReader.get("login.valid.email"), ConfigReader.get("login.valid.password"));

        Response response=LoginService.login(request);

        response.then().statusCode(201);

        String token=response.jsonPath().getString("token");

        Assert.assertTrue(token!=null);

        TokenManager.setToken(token);
    }

    @Test
    public void unknownEmailTest() {

        LoginRequest request=new LoginRequest(ConfigReader.get("login.unknown.email"), ConfigReader.get("login.unknown.password"));

        Response response=LoginService.login(request);

        response.then().statusCode(400);

        String message=response.jsonPath().getString("message[0].value");

        Assert.assertEquals(message, ConfigReader.get("login.msg.invalid.email"));
    }

    @Test
    public void wrongPasswordTest() {

        LoginRequest request=new LoginRequest(ConfigReader.get("login.valid.email"), ConfigReader.get("login.wrong.password"));

        Response response=LoginService.login(request);

        response.then().statusCode(400);

        String message=response.jsonPath().getString("message[0].value");

        Assert.assertEquals(message,ConfigReader.get("login.msg.wrong.password"));
    }

    @Test
    public void missingFieldsTest() {

        LoginRequest request=new LoginRequest(null, null);

        Response response=LoginService.login(request);

        response.then().statusCode(400);

        String message=response.jsonPath().getString("message[0].value");

        Assert.assertEquals(message, ConfigReader.get("login.msg.missing.fields"));
    }
}