import static io.restassured.RestAssured.given;

public class GetGoResr {

	public static void main(String[] args) {
		given()
		
		.header("Authorization","Bearer QHg-NmZ6J2N6ipPyo_e0csmZkBDimy567wdX")
		.header("Content-Type","application/json")
		.log().all()
		.when()
		.get("https://gorest.co.in/public-api/users")
		.then().log().all();
		

	}

}
