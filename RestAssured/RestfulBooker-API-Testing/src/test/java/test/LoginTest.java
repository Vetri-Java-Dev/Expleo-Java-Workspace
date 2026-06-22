package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.factory.AuthDataFactory;
import io.restassured.response.Response;
import model.Request.AuthRequest;
import service.AuthService;

public class LoginTest {
	
	@Test
	public void login() {
		
		AuthRequest loginData=AuthDataFactory.getValidData();
		
		Response response=AuthService.login(loginData);
		
		response.prettyPrint();
		
		response.then().statusCode(200);
		
	}
	
	
}
