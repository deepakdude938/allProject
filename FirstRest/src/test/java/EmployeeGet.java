import java.util.HashMap;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class EmployeeGet {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("User", "Deepak");
		m.put("Pass","Dude");
		m.put("Add", "Kothrud");
		//http://216.10.245.166/Library/GetBook.php?AuthorName=Priyanka
		RestAssured.baseURI = "http://216.10.245.166";
		given()
		        .header("Content-Type","application/json")
		        .queryParams(m)
		        .log().all()
		        .when()
		        .get("/Library/GetBook.php")
		        .then().log().all();

	}

}
