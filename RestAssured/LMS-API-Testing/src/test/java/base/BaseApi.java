package base;

import io.restassured.specification.RequestSpecification;
import utility.TokenManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BaseApi {
	
	public static RequestSpecification request() {

	    RequestSpecification request =
	            RestAssured
	            .given()
	            .baseUri("https://lms-server-3-wedg.onrender.com")
	            .contentType(ContentType.JSON);

	    if(TokenManager.getToken() != null) {
	        request.header("Authorization","Bearer "+TokenManager.getToken());
	    }
	    
	    return request;
	}
	
	
}
