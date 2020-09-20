import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;


import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class Test1Extract {

	public static void main(String[] args) {
		
			RestAssured.baseURI="http://216.10.245.166";
			String responceString= given()
			.body("{\n" + 
					"\"name\":\"Bal Ganesh \",\n" + 
					"\"isbn\":\"20006\",\n" + 
					"\"aisle\":\"4523\",\n" + 
					"\"author\":\"Deepak Patil \"\n" + 
					"}\n")
			.header("Content-Type","application/json")
			.log().all()
			.when()
			.post("/Library/Addbook.php")
			.then().log().all()
			.assertThat()
			.statusCode(200)
			.body("Msg", Matchers.equalTo("successfully added"))
			.extract().asString();
			System.out.println("Responce Extract from server "+responceString);
			JsonPath js=new JsonPath(responceString);
			String id=js.getString("ID");
			System.out.println(id);
			given()
			.when()
			.get("Library/GetBook.php?ID="+id)
			.then()
			.log().all();
	

			
			

		}

	}
