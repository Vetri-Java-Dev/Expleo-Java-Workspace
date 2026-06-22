package baseapi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utility.TokenManager;

public class BaseApi {
	
	public static RequestSpecification request() {
		RequestSpecification request=RestAssured
								.given()
								.baseUri("https://restful-booker.herokuapp.com")
								.contentType(ContentType.JSON);
		
		
		if(TokenManager.getToken()!=null) {
			request.header("Authentication","Bearer "+TokenManager.getToken());
		}
		
		return request;
	}
}
