package API;

import org.testng.Assert;
import org.testng.annotations.Test;
import env.*;
import io.restassured.*;
import io.restassured.specification.RequestSpecification;
import org.json.*;
import io.restassured.response.Response;

public class formAPITest {

	@Test
	public void testAPI1() {

		RestAssured.baseURI = env.API_CORREO;

		String body = RestAssured.given().when().get().then().extract().body().asString();

		System.out.println("response body: " + body);
		//System.out.println("Response body: " + response.body().asString());

	}

	/**
	 * 
	 {
		"fullName": "Julio David Velasquez",
		"dni": "218179276",
		"address": "dadadsfa",
		"email": "julio.david.velasquez@gmail.com",
		"phoneNumber": "54764558"
	 }
	 * 
	 */
	
	@Test
	public void testAPI2() {
		
		RestAssured.baseURI = env.API_CORREO;

		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("fullName", "Kevin Palencia");
		requestParam.put("dni", "1122");
		requestParam.put("address", "ciudad guatemala");
		requestParam.put("email", "julio.david.velasquez@gmail.com");
		requestParam.put("phoneNumber", "12232312");

		request.header("Content-Type", "application/json");
		request.body(requestParam.toString());
		Response response = request.post("/creditcard");
		
		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());
	
		Assert.assertEquals(statusCode , 200 , "Correct status code returned");

	
	}

}
