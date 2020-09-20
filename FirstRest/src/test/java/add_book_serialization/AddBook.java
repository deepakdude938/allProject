package add_book_serialization;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class AddBook {

	public static void main(String[] args) {
		BookDetails add=new BookDetails();
		add.setName("kkkkkk");
		add.setAuthor("dhf");
		add.setAisle(87896);
		add.setIsbn("idhfoh");
		
		
		
		RestAssured.baseURI="http://216.10.245.166";
		given()
		.body(add)
		.header("Content-Type","application/json")
		.log().all()
		.when()
		.post("/Library/Addbook.php")
		.then().log().all()
	//	.assertThat()
	//	.statusCode(200)
		.body("Msg", Matchers.equalTo("successfully added"));
		
	}

}
