package authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostAuthenticationToken {
	@Test
	public void postAuthenticationToken() {

		baseURI = "https://api.github.com";
		JSONObject obj = new JSONObject();
		obj.put("name", "BasicAuth");

		given().auth().basic("errolaanjani@gmail.com", "Anjani091998@").body(obj).contentType(ContentType.JSON).when()
				.post("/user/repos").then().log().all();

	}
}
