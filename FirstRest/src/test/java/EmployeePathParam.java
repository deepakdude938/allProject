import static io.restassured.RestAssured.given;

public class EmployeePathParam {

	public static void main(String[] args) {
		
		String deleteEndpoint="http://dummy.restapiexample.com/api/v1/delete/{id}";
		String id="7689";

		given()
		.log().all()
		.pathParam("id",id)
		.when()
		.delete(deleteEndpoint)
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();

}

	}


