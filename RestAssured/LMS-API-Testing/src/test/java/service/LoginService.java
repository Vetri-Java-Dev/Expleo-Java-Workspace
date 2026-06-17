package service;

import io.restassured.response.Response;
import model.LoginRequest;
import base.BaseApi;
import endpoint.EndPoints;

public class LoginService {
	
	public static Response login(LoginRequest request) {
		return BaseApi
				.request()
				.body(request)
				.when().post(EndPoints.LOGIN);
	}
	
}
