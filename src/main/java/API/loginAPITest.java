package API;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import env.env;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class loginAPITest {

	
	/**
	 * 
	 {
		"user": "Julio David Velasquez",
		"password": "218179276"
	 }
	 * 
	 */
	
	@Test
	public void LoginAPITest() {
		
		RestAssured.baseURI = env.API_LOGIN;

		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("user", "Julio David Velasquez");
		requestParam.put("password", "pass/*2022");
		
		request.header("Content-Type", "application/json");
		request.body(requestParam.toString());
		Response response = request.post("/login");
		
		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());
	
		Assert.assertEquals(statusCode , 200 , "Correct status code returned");

	
	}
	
	public void emailAPITest() {
		
	}

	
}
