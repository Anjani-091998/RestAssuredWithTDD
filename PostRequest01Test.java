package CRUDOperation;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class PostRequest01Test {

  @Test
		
		public void postRequset1Test() {
			baseURI = "http://localhost:8080";
			JSONObject Object = new JSONObject();
			
			Object.put("email","mashewari09@gmail.com");
			Object.put("name","Mashewari");
			Object.put("password","mashewari09@");
			
		given()
		.contentType(ContentType.JSON)
		.body(Object)
			
		.when()
		.post("/admin")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		}
	}


