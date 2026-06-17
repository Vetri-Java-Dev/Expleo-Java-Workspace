package test;

import service.RoleService;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RoleTest {
	
	@Test(dependsOnMethods="test.LoginTest.validLoginTest")
	public void roleTest() {
		
		Response response=RoleService.getAllRoles();
		
		response
			.then().statusCode(200);
		
		response.prettyPrint();
		
	}
	
	
}
