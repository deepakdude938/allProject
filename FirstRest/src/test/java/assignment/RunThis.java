package assignment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RunThis {

	public static void main(String[] args) {
		BookDetails detail=new BookDetails();
		detail.setName("Young");
		detail.setAuthor("Deepak D");
		detail.setAisle(9089);
		detail.setIsbn("dshcfkhsd");
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(detail)
		.log().all()
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log().all();
		
	}

}
