/**
 * 
 */
package com.org.SampleAPI;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

/**
 * @author pratikpadwekar
 *
 */
public class Sample_Patch_API {
	
	
	@Test
	public void test_1_Post(){ 
		
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Pratik");
		request.put("job", "IT Sodware");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
		given().
		
		// For headers 
		
//		header("Content-Type" , "application/json").
//		contentType(ContentType.JSON).accept(ContentType.JSON).
//		
			body(request.toJSONString()).
			when().
			patch("https://reqres.in/api/users/2").
			then().
			statusCode(200).log().all();
		
		}

}
