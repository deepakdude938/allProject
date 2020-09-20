
import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class JsonAddBook {
	public static void main(String[] args) {
		RestAssured.baseURI="http://216.10.245.166";
		given()
		.body("{\n" + 
				"\"name\":\"ncdgcb \",\n" + 
				"\"isbn\":\"bhg\",\n" + 
				"\"aisle\":\"452\",\n" + 
				"\"author\":\"vinod A \"\n" + 
				"}\n")
		.header("Content-Type","application/json")
		.log().all()
		.when()
		.post("//Library/Addbook.php")
		.then().log().all()
		.assertThat()
		.statusCode(200)
		.body("Msg", Matchers.equalTo("successfully added"));
		

	}

}