import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class Employee {

	public static void main(String[] args) {
		
		/*
		 * RestAssured.baseURI="http://dummy.restapiexample.com"; given()
		 * 
		 * .body("{\r\n" + "    \"name\": \"Snehal\",\r\n" +
		 * "    \"salary\": \"30000\",\r\n" + "    \"age\": \"27\"\r\n" + "}")
		 * .header("Content-Type","application/json") .log().all() .when()
		 * .post("/api/v1/create") .then().log().all();
		 * 
		 */
		
		
		
		
		
		
//Another example of GET
		/*
		 * given() .body("{\r\n" + "    \"first_name\": \"Deepak\",\r\n" +
		 * "    \"last_name\": \"Dude\",\r\n" + "    \"gender\": \"male\",\r\n" +
		 * "    \"email\": \"asdefrgf90@gmail.com\",\r\n" +
		 * "    \"status\": \"active\"\r\n" + "}")
		 * .header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
		 * .header("Content-Type","application/json") .log().all() .when()
		 * .get("https://gorest.co.in/public-api/users") .then().log().all();
		 */
		
// Another example of GET		
//		given()
//		.body("{\"first_name\":\"Brian\",\"last_name\":\"Ratke\",\"gender\":\"male\",\"email\":\"lew19@roberts.com\",\"status\":\"active\"}")
//		.header("Authorization","Bearer KxH5L7KnBoBeWPmtpuvoNpWPgRamDNNMEEYy")
//		.header("Content-Type","application/json")
//		.log().all()
//		.when()
//		.get("https://gorest.co.in/public-api/users")
//		.then().log().all();
//		
		
		//Another example of POST
		
 // RestAssured.baseURI="http://dummy.restapiexample.com";
  given()
		  
		  .body("{\"first_name\":\"Brian\",\"last_name\":\"Ratke\",\"gender\":\"male\",\"email\":\"lew199@roberts.com\",\"status\":\"active\"}\r\n" + 
		  		"")
		  .header("Authorization","Bearer KxH5L7KnBoBeWPmtpuvoNpWPgRamDNNMEEYy")
		  .header("Content-Type","application/json") 
		  .log()
		  .all() 
		  .when()
		  .post("https://gorest.co.in/public-api/users") 
		  .then().log().all();
		  
		 
		
		
		
		
		
		
	}

}
