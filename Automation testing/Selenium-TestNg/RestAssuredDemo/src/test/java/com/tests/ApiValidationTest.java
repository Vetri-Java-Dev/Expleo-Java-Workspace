package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiValidationTest {
	
	@Test
	public static void getUserEmail(){
		
		String email=RestAssured
				.given()
				.when().get("https://jsonplaceholder.typicode.com/users/1")
				.jsonPath().getString("email");
		
		System.out.print("Email : "+email);
		
		Assert.assertEquals(email, "Sincere@april.biz");
		
	
	}
	
	
}
