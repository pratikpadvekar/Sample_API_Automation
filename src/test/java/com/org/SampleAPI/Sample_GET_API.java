package com.org.SampleAPI;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import static io.restassured.matcher.RestAssuredMatchers.*;


public class Sample_GET_API {
	
	//simple get request 
	@Test
	public void Test_01() {
		
	Response response =	RestAssured.get("https://reqres.in/api/users?page=2");
	
	
	System.out.println("Response Status : "+ response.getStatusCode());
	System.out.println("Response Body : " + response.getBody().asString());
	System.out.println("Header Auth-Key : " +response.getHeader("auth-key"));
	System.out.println("Header Content-Type : " + response.getHeader("Content-Type"));
	System.out.println("Header App Name : " + response.getHeader("app"));
	System.out.println("API Time : " + response.getTime());
	
		
	}

	@Test
	void Test_02() {
		
		System.out.println("Verify Status Code is 200 ");
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		 statusCode(200).
		 log().all();
	}
	

	
	@Test
	void Test_03() {
		System.out.println("Verify the API Time");
		long timeInMs = get("https://reqres.in/api/users?page=2").time();
	}
	
	
	@Test
	void Test_04() {
		
		System.out.println("Verify Status Code is 200 ");
		given().
		
		// For Header need to add 
		
//		header("Content-Type" , "application/json").
//		header("app" , "Airtel").
		
		get("https://reqres.in/api/users?page=2").
		then().
		 statusCode(200).
		 body("data.id[0]",equalTo(7)).
		 log().all();
	}
	
	@Test
	void Test_05() {
		
		System.out.println("Verify Status Code is 200 ");
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		 statusCode(200).
		 body("data.email[0]",equalTo("michael.lawson@reqres.in")).
		 log().all();
	}
	
	@Test
	void Test_06() {
		
		System.out.println("Verify Status Code is 200 ");
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		 statusCode(200).
		 body("data.first_name[0]",equalTo("Michael")).
		 log().all();
	}
	
	@Test
	void Test_07() {
		
		System.out.println("Verify Status Code is 200 ");
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		 statusCode(200).
		 body("data.last_name[0]",equalTo("Lawson")).
		 log().all();
	}
	
	@Test
	void Test_08() {
		
		System.out.println("Verify Status Code is 200 ");
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		 statusCode(200).
		 body("data.avatar[0]",equalTo("https://reqres.in/img/faces/7-image.jpg")).
		 log().all();
	}
	
	
}
		
 



