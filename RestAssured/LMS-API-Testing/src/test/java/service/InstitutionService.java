package service;

import io.restassured.response.Response;
import model.LoginRequest;
import base.BaseApi;
import endpoint.EndPoints;

public class InstitutionService {
	
	public static Response getAllInstitution() {
		return BaseApi
				.request()
				.when().get(EndPoints.ALLINSTITUTIONS);
	}
	
}
