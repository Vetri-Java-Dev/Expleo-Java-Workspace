package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.factory.AuthDataFactory;
import io.restassured.response.Response;
import model.Request.AuthRequest;
import model.Response.AuthResponse;
import service.AuthService;

public class LoginTest {
	
	@Test
	public void login() {
		
		AuthRequest loginData=AuthDataFactory.getValidData();
		
		AuthResponse response=AuthService.login(loginData);
		
		Assert.assertTrue(response.getToken()!=null);
		
	}
	
	
}
