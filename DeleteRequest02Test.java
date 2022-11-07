package CRUDOperation;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequest02Test {
	

		@Test
		public void deleteRequest01Test() {
			baseURI = "http://localhost:8080";
			given()
			.contentType("application/json");
			
			when()
			.delete("/foodMenus/1")
			
			.then()
			.assertThat().statusCode(200)
			.log().all();
		
		}

	}
