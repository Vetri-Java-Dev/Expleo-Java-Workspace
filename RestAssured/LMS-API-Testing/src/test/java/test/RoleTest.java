package test;

import io.restassured.specification.RequestSpecification;
import model.LoginRequest;
import service.LoginService;
import service.RoleService;
import utility.TokenManager;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RoleTest {
	
	@Test(dependsOnMethods="test.LoginTest.loginTest")
	public void roleTest() {
		
		Response response=RoleService.getAllRoles();
		
		response
			.then().statusCode(200);
		
		response.prettyPrint();
		
	}
	
	
}
