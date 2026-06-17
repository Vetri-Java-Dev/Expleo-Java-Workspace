package test;

import io.restassured.specification.RequestSpecification;
import model.LoginRequest;
import service.InstitutionService;
import service.LoginService;
import utility.TokenManager;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import test.LoginTest;

public class InstitutionTest {
	
	public void institutionTest() {

		Response response=InstitutionService.getAllInstitution();
		response.then().statusCode(200);
		
		response.prettyPrint();
		
	}
	
	
}
