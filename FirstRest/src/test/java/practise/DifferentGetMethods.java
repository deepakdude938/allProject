package practise;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DifferentGetMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/api/users";
//	Second Way of get method	
//		Response respone=RestAssured.given().param("page", "2").when().get();
//		
//		System.out.println(respone.getBody().asString());
//		System.out.println(respone.getStatusCode());
//		System.out.println(respone.contentType());
//		System.out.println(respone.getTime());
//		System.out.println(respone.getCookies());
//		System.out.println(respone.prettyPrint());
//		
//		
//		
		
		
		
		
		
		
		
		
		
//	First way of Get Method
//		RestAssured.given()
//		.param("page","2")
//		.when()
//		.get()
//		.then()
//		.assertThat()
//		.log().all()
//		.statusCode(200);
	}

}
