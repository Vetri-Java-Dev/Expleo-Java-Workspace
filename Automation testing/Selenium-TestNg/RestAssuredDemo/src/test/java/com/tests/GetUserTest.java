package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserTest {
	
	@Test
	public static void getUserTest(){
		
		Response response=RestAssured
				.given()
				.when().get("https://jsonplaceholder.typicode.com/users/1");
		
		System.out.print("Status code : "+response.getStatusCode());
		
		System.out.println("");
		response.prettyPrint();
		System.out.println("");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println("Name : "+response.jsonPath().getString("name"));
		
		Assert.assertEquals(response.jsonPath().getString("name"),"Leanne Graham");
	}
	
	
}
