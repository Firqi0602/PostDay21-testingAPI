package com.juaracodingrestasuredkuis;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPostProducts {

	@Test
	public void testPost() {
		JSONObject request = new JSONObject();
		request.put("name","John");
		request.put("product","Noodles");
		System.out.println(request.toJSONString());
	
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(404)
		.log().all();
	}
	}
