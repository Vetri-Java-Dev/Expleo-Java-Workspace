package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUserTest {

    @Test
    public void createUserTest() {

        Map<String, Object> payload = new HashMap<>();

        payload.put("title", "First Creation");
        payload.put("body", "For learning purpose");
        payload.put("userId", 100);

        Response response=RestAssured
                .given().contentType(ContentType.JSON).body(payload)
                .when().post("https://jsonplaceholder.typicode.com/posts");

        System.out.println("Status code : " +response.getStatusCode());

        response.prettyPrint();

        Assert.assertEquals(response.getStatusCode(), 201);

        Assert.assertEquals(response.jsonPath().getString("title"),"First Creation");
    }
}