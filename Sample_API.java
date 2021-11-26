package Sample_API.com.org.Sample_API;


import org.testng.annotations.Test;


public class Sample_API {
	
	//simple get request 
	@Test
	public void Test_01() {
		
	Response response =	RestAssured.get("https://360-uatv2.servify.tech/publicApi/api/v1/CarrierIntegration/generateConsumerToken");
	
	
	System.out.println("Response Status : "+ response.getStatusCode());
	System.out.println("Response Body : " + response.getBody().asString());
	System.out.println("Header Auth-Key : " +response.getHeader("auth-key"));
	System.out.println("Header Content-Type : " + response.getHeader("Content-Type"));
	System.out.println("Header App Name : " + response.getHeader("app"));
	System.out.println("API Time : " + response.getTime());
	
		
	}

	@Test
	void Test_03() {
		
		System.out.println("Verify Status Code is 200 ");
		given().
		get("https://360-uatv2.servify.tech/publicApi/api/v1/CarrierIntegration/generateConsumerToken").
		then().
		 statusCode(200).
		 log().all();
	}
	

	
	@Test
	void Test_02() {
		System.out.println("Verify the API Time");
		long timeInMs = get("https://360-uatv2.servify.tech/publicApi/api/v1/CarrierIntegration/generateConsumerToken\"").time();
		

	}
}
		




