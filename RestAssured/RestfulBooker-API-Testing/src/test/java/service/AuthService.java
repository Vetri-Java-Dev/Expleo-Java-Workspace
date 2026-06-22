package service;

import baseapi.BaseApi;
import endpoints.AuthEndpoint;
import io.restassured.response.Response;
import model.Request.AuthRequest;
import model.Response.AuthResponse;

public class AuthService {
	
	public static AuthResponse login(AuthRequest request) {
		
		Response response=BaseApi
				.request()
				.body(request)
				.when()
				.post(AuthEndpoint.AUTH);
		
        AuthResponse authResponse=response.as(AuthResponse.class);
        
        return authResponse;
        
	}
	
}
