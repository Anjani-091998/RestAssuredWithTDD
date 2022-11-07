package CRUDOperation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetRequest02Test {

		@Test
		public void getRequest02Test() {
			baseURI = "http://localhost:8080";
			
			given()
			.contentType("application/json");
			when()
			.get("/foodMenus/25")
			
			.then()
			.assertThat().statusCode(200)
			.log().all();
			
		}
	}

