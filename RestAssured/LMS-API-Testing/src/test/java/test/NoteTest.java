package test;

import io.restassured.specification.RequestSpecification;
import model.*;
import service.*;
import utility.ConfigReader;
import utility.TokenManager;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class NoteTest {

	@Test(dependsOnMethods="test.LoginTest.validLoginTest")
	public void CreateNoteTest() {

		String[] tags = ConfigReader.getArray("note.create.tags");
		
        NoteRequest request = new NoteRequest(
                ConfigReader.get("note.create.title"), //title
                ConfigReader.get("note.create.content"), //content
                tags,
                ConfigReader.getBoolean("note.create.isPinned"), //isPinned
                ConfigReader.get("note.create.color"), //color
                null, //id
                null //lastEdited
        );

	    Response response=NoteService.createNote(request);

	    response.prettyPrint();
	    
	    response.then()
	    	.statusCode(201)
	    	.body("data.title",equalTo(ConfigReader.get("note.create.title")));

	}
	
	@Test(dependsOnMethods = "test.LoginTest.validLoginTest")
	public void getAllNotesTest() {

	    Response response = NoteService.getAllNote(
	    		ConfigReader.getInt("note.getAll.page"),//page
	            ConfigReader.getInt("note.getAll.limit"),//limit
	            null,//search
	            null,//tags
	            null,//isPinned
	            ConfigReader.get("note.getAll.sortBy"),//sortBy
	            ConfigReader.get("note.getAll.sortOrder")//sortOrder
	    );

	    response.prettyPrint();

	    response.then()
	            .statusCode(200)
	            .body("success", equalTo(true))
	            .body("data.size()", greaterThan(0));
	}
	
	@Test(dependsOnMethods = "test.LoginTest.validLoginTest")
	public void getNoteByIdTest() {

	    String noteId=ConfigReader.get("note.id");

	    Response response=NoteService.getNoteById(noteId);

	    response.prettyPrint();

	    response.then()
	            .statusCode(200)
	            .body("success", equalTo(true))
	            .body("data._id", equalTo(noteId))
	            .body("data.title", notNullValue())
	            .body("data.content", notNullValue())
	            .body("data.tags", notNullValue());
	}
	
	@Test(dependsOnMethods = "test.LoginTest.validLoginTest")
	public void getNoteByInvalidIdTest() {

	    String noteId=ConfigReader.get("note.invalid.id");

	    Response response=NoteService.getNoteById(noteId);

	    response.prettyPrint();

	    response.then()
	            .statusCode(500)
	            .body("success", equalTo(false));
	}
	
	@Test(dependsOnMethods = "test.LoginTest.validLoginTest")
	public void updateNoteTest() {

	    String id=ConfigReader.get("note.id");

	    Map<String, Object> body = new HashMap<>();
	    body.put("title", ConfigReader.get("note.update.title"));
	    body.put("content", ConfigReader.get("note.update.content"));
	    body.put("tags", new String[]{});
	    body.put("isPinned", ConfigReader.getBoolean("note.update.isPinned"));
	    body.put("color", ConfigReader.get("note.update.color"));

	    Response response=NoteService.updateNote(id,body,TokenManager.getToken());

	    response.prettyPrint();

	    response.then()
	            .statusCode(200)
	            .body("success", equalTo(true))
	            .body("data.title", equalTo(ConfigReader.get("note.update.title")))
	            .body("data.content", equalTo(ConfigReader.get("note.update.content")));
	}
	
	
	@Test(dependsOnMethods = "test.LoginTest.validLoginTest")
	public void togglePinTest() {

	    String id=ConfigReader.get("note.id");

	    Response response = NoteService.togglePin(id);

	    response.prettyPrint();

	    response.then()
	            .statusCode(200)
	            .body("success", equalTo(true))
	            .body("message", equalTo(ConfigReader.get("note.togglePin.expectedMessage")))
	            .body("data._id", equalTo(id))
	            .body("data.isPinned", equalTo(true));
	}
	
	@Test(dependsOnMethods = "test.LoginTest.validLoginTest")
	public void deleteNoteTest() {

	    String id = ConfigReader.get("note.id");

	    Response response = NoteService.deleteNote(id);

	    response.prettyPrint();

	    response.then()
	            .statusCode(200)
	            .body("success", equalTo(true))
	            .body("deletedCount", equalTo(1));
	}
}