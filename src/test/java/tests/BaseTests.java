package tests;

import static org.junit.Assert.assertEquals;

import helpers.RestAssuredHelper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseTests {

	RestAssuredHelper restAssuredHelper;

	public BaseTests() {
		SetBaseUri();
		restAssuredHelper = new RestAssuredHelper();
	}

	public void SetBaseUri() {
		RestAssured.baseURI = "http://bpdts-test-app-v2.herokuapp.com/";
	}

	public void AssertStatusCode(Response response, int expectedStatusCode) {
		int actualStatusCode = response.getStatusCode();
		System.out.println("Response Status Code: " + actualStatusCode);
		assertEquals(expectedStatusCode, actualStatusCode);
	}

	public void AssertresponseContentType(Response response, String responseContentType) {
		String actualresponseContentType = response.contentType();
		System.out.println("application/json" + actualresponseContentType);
		assertEquals(actualresponseContentType, actualresponseContentType);
	}

	public void AssertDescription(Response response, String responseDescription) {
		String actualDescription = response.statusLine();
		System.out.println("Success" + actualDescription);
		assertEquals(actualDescription, actualDescription);
	}

}
