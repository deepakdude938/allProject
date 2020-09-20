package deserialization_assignment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

public class RunThis {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("Deepak Dude");
		emp.setAge("27");
		emp.setId(123);
		emp.setSalary("30000");
		
		EmployeeResponse response=new EmployeeResponse();
		System.out.println("Response object before Deserialization----->>>>"+response);
		
		response=RestAssured.given()
				.log().all()
				.contentType(ContentType.JSON)
				.body(emp)
				.when()
				.post("http://dummy.restapiexample.com/api/v1/create")
				.then()
				.log().all()
				.defaultParser(Parser.JSON)
				.extract().as(EmployeeResponse.class)
				;
		
		System.out.println("Response object After Deserialization:"+response);
		
	}

}
