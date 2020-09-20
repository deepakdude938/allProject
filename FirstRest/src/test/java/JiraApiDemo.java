import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.hamcrest.Matchers;

import com.github.fge.jsonschema.main.cli.Main;

import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;

public class JiraApiDemo {
	public static final String SESSION_URL="rest/auth/1/session";
	public static final String CREATE_TICKET="rest/api/2/issue";
	public static final String uploadFile="rest/api/2/issue/JIR-4/attachments";
	public static void createTicket() {
		SessionFilter  filter=new SessionFilter();
		
		//create session
		
		RestAssured.baseURI="http://localhost:8080/";
		given()
		.contentType(ContentType.JSON)
		.body(PayloadDemo.createSessionPayload)
		.log().all()
		.filter(filter)
		.when()
		.post(SESSION_URL)
		.then()
		.assertThat()
		.statusCode(200)
		.body("session.value",Matchers.notNullValue())
		.log().all();
		
		
		//creating a new ticket code

		given()
		.contentType(ContentType.JSON)
		.body(PayloadDemo.createTicketPayload)
		.log().all()
		.filter(filter)
		.when()
		.post(CREATE_TICKET)
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		 
		
		//  Uploading a file
		
		given()
		.header("X-Atlassian-Token","nocheck")
		.header("content-Type","multipart/form-data")
		.filter(filter)
		.multiPart("file",new File("C:\\Users\\abc\\Desktop\\Testcase.xlsx"))
		.log().all()
		.when()
		.post(uploadFile)
		.then()
		.log().all();
	}
	
	public static void main(String[] args) {
		JiraApiDemo.createTicket();
		
	}


}
