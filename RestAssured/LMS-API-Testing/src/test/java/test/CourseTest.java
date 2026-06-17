package test;

import io.restassured.specification.RequestSpecification;
import model.LoginRequest;
import service.*;
import utility.TokenManager;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CourseTest {
	
	@Test(dependsOnMethods="test.LoginTest.loginTest")
	public void courseTest() {
		
		Response response=CourseService.getAllCourses();
		
		response
			.then().statusCode(200);
		
		response.prettyPrint();
		
	}
	
	
}
