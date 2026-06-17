package service;

import io.restassured.response.Response;
import model.LoginRequest;
import base.BaseApi;
import endpoint.EndPoints;

public class RoleService {
	
	public static Response getAllRoles() {
		return BaseApi
				.request()
				.when().get(EndPoints.ALLROLES);
	}
	
}
