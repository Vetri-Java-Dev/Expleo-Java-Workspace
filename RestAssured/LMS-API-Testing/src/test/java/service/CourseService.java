package service;

import io.restassured.response.Response;
import model.LoginRequest;
import base.BaseApi;
import endpoint.EndPoints;

public class CourseService {
	
	public static Response getAllCourses() {
		return BaseApi
				.request()
				.when().get(EndPoints.ALLCOURSES);
	}
	
}
