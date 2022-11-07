package CRUDOperation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetRequest01Test {


	@Test
	public void getRequest1Test() {
		baseURI = "http://localhost:8080";
		given().contentType("application/json")
		.when()
		.get("/admin/10")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}
	


