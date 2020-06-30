package tests;

import org.junit.Test;
import constants.RequestType;
import constants.RestAssuredConstants;
import constants.StatusCodeConstants;
import io.restassured.response.Response;

public class GetAction extends BaseTests {
	@Test
	public void GetCityUsers() {
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Get, "/city/London/users", null);
		AssertStatusCode(response, StatusCodeConstants.Ok);
		AssertresponseContentType(response, RestAssuredConstants.ContentType);
		AssertDescription(response, StatusCodeConstants.STATUS);

	}

	@Test
	public void getInstructions() {
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Get, "/instructions", null);
		AssertStatusCode(response, StatusCodeConstants.Ok);
		AssertresponseContentType(response, RestAssuredConstants.ContentType);
		AssertDescription(response, StatusCodeConstants.STATUS);
	}

	@Test
	public void getUserId() {
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Get, "/user/5", null);
		AssertStatusCode(response, StatusCodeConstants.Ok);
		AssertresponseContentType(response, RestAssuredConstants.ContentType);
		AssertDescription(response, StatusCodeConstants.STATUS);

	}

	@Test
	public void getInvalidUserId() {
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Get, "/user/Invalid", null);
		AssertStatusCode(response, StatusCodeConstants.NOTFOUND);
		AssertresponseContentType(response, RestAssuredConstants.ContentType);
		AssertDescription(response, StatusCodeConstants.STATUS);
	}

	@Test
	public void getAllUser() {
		Response response = restAssuredHelper.SpecifyAndSendRequest(RequestType.Get, "/users", null);
		AssertStatusCode(response, StatusCodeConstants.Ok);
		AssertresponseContentType(response, RestAssuredConstants.ContentType);
		AssertDescription(response, StatusCodeConstants.STATUS);

	}

}