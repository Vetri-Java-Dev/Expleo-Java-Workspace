package test;


import service.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CourseTest {
	
	@Test(dependsOnMethods="test.LoginTest.validLoginTest")
	public void courseTest() {
		
		Response response=CourseService.getAllCourses();
		
		response
			.then().statusCode(200);
		
		response.prettyPrint();
		
	}
	
	
}
