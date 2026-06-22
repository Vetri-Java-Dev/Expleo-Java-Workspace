package service;

import baseapi.BaseApi;
import endpoints.AuthEndpoint;
import io.restassured.response.Response;
import model.Request.AuthRequest;

public class AuthService {
	
	public static Response login(AuthRequest request) {
		return BaseApi
				.request()
				.body(request)
				.when()
				.post(AuthEndpoint.AUTH);
	}
	
}
