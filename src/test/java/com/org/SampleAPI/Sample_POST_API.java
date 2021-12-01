package com.org.SampleAPI;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

public class Sample_POST_API {
	
	
	@Test
	public void test_1_Post(){ 
		
//		Map<String, Object>  map =  new HashMap<String , Object >();
//		
//		map.put("name" , "Pratik");
//		map.put("job", "IT Software");
		
	//	System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Pratik");
		request.put("job", "IT Sodware");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
		given().
		
		// For headers 
		
		header("Content-Type" , "application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
//		
			body(request.toJSONString()).
			when().
			post("https://reqres.in/api/users").
			then().
			statusCode(201);
		
		}
	

}
