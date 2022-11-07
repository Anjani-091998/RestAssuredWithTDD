package CRUDOperation;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequest02Test {


	  @Test
			
			public void postRequest02Test() {
				baseURI = "http://localhost:8080";
				JSONObject Object = new JSONObject();
				
				//Admin Object
				JSONObject ad1=new JSONObject();
				ad1.put("email","earth@gmail.com");
				ad1.put("id", 62);
				ad1.put("name","Earth");
				ad1.put( "password", "earth09@");
				
				
				// insert the admin values
				Object.put("admin", ad1);
				
				
				//inside array product values
				JSONObject pv1=new JSONObject();
				pv1.put( "cost", 100);				      

				pv1.put ("description","Test");

				pv1.put("name","AKk");

				pv1.put("type","veg");
				
				
				//product Array
				JSONArray pA=new JSONArray();
				pA.add(pv1);
				
				//product key
				Object.put("product", pA);
				
				    	  
				
			given()
			.contentType(ContentType.JSON)
			.body(Object)
				
			.when()
			.post("/foodMenus")
			
			.then()
			.assertThat().statusCode(201)
			.log().all();
			
			}
		}

