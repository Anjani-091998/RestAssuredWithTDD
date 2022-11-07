package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;



public class BasicAuthTest {
	@Test
	public void basicAuthTest() {
		
		baseURI = "https://github.com";
		
		given().auth().basic("errolaanjani@gmail.com", "Anjani091998@")
		.when().get("/login")
		.then().log().all();
		
	}

}
