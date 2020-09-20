import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
public class api {

	public static void main(String[] args) {
	//	System.out.println("depak");
		RestAssured.baseURI="http://216.10.245.166";
		given()
		
			.body("{\r\n" + 
					"    \"name\": \"WonderFulll\",\r\n" + 
					"    \"isbn\": \"ghy4565\",\r\n" + 
					"    \"aisle\": \"123455t3677836"
					+ "\",\r\n" + 
					"    \"author\": \"King\"\r\n" + 
					"}")
			.header("Content-Type","application/json")
			.log().all()
			.when()
			.post("/Library/Addbook.php")
			.then().log().all()
			.body("ID", Matchers.equalTo("ghy4565123455t367836"));
		
		

	}

}
