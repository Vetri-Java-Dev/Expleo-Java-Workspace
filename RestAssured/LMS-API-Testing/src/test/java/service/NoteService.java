package service;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.LoginRequest;

import java.util.Map;

import base.BaseApi;
import endpoint.EndPoints;
import model.NoteRequest;
import utility.TokenManager;

public class NoteService {
	
	public static Response createNote(NoteRequest request) {
		return BaseApi
				.request()
				.body(request)
				.when().post(EndPoints.CREATENOTE);
	}
	
	public static Response getAllNote(Integer page,Integer limit,String search,String tags,Boolean isPinned,
	        String sortBy,String sortOrder) {
	    
		return BaseApi
	            .request()
	            .queryParam("page", page)
	            .queryParam("limit", limit)
	            .queryParam("search", search)
	            .queryParam("tags", tags)
	            .queryParam("isPinned", isPinned)
	            .queryParam("sortBy", sortBy)
	            .queryParam("sortOrder", sortOrder)
	            .when()
	            .get(EndPoints.GETALLNOTE);
	}
	
	public static Response getNoteById(String noteId) {
	    return BaseApi
	            .request()
	            .pathParam("id", noteId)
	            .when()
	            .get(EndPoints.GET_NOTE_BY_ID);
	}
	
	public static Response updateNote(String id, Map<String, Object> body, String token) {

	    return BaseApi
	            .request()
	            .header("Authorization", "Bearer " + token)
	            .contentType(ContentType.JSON)
	            .pathParam("id", id)
	            .body(body)
	            .when()
	            .put(EndPoints.UPDATE_NOTE);
	}
	
	public static Response togglePin(String id) {
	    return BaseApi
	            .request()
	            .pathParam("id", id)
	            .when()
	            .put(EndPoints.TOGGLE_NOTE);
	}
	
	public static Response deleteNote(String id) {

	    return BaseApi
	            .request()
	            .pathParam("id", id)
	            .when()
	            .delete(EndPoints.DELETE_NOTE);
	}
	
	
}
