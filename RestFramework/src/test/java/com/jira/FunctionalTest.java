package com.jira;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;

public class FunctionalTest {
	@Test
	public static SessionFilter create_Session() {
		SessionFilter filter=new SessionFilter();
		TestBase.restAssuredURL();
		given()
//		.contentType(ContentType.JSON)
		.header("Content-Type","application/json")
		.body(Payload.createSessionPayload)
		.log().all()
		.when()
		.post(TestBase.SESSION_URL)
		.then()
		.assertThat()
		.body("session.value",Matchers.notNullValue())
		.log().all();
		
		return filter;
		
}
	@Test
	public static void create_Ticket() {
		TestBase.restAssuredURL();		
		/*
		 * given() // .header("Content-Type","application/json")
		 * .contentType(ContentType.JSON) .body(Payload.createTicketPayload)
		 * .log().all() .filter(FunctionalTest.create_Session()) .when()
		 * .post(TestBase.CREATE_TICKET) .then() .assertThat() .statusCode(201)
		 * .log().all();
		 */		
		
		given()
		.contentType(ContentType.JSON)
		.body(Payload.createTicketPayload)
		.log().all()
		.filter(FunctionalTest.create_Session())
		.when()
		.post(TestBase.CREATE_TICKET)
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}
	
//	@Test
	public void uploadFile() {
		TestBase.restAssuredURL();
		given()
		.header("X-Atlassian-Token","nocheck")
		.header("Content-Type","multipart/form-data")
		.filter(FunctionalTest.create_Session())
		.multiPart("file",new File("C:\\Users\\abc\\Desktop\\Testcase.xlsx"))
		.log().all()
		.when()
		.post(TestBase.uploadFile)
		.then()
		.log().all();
	}
	
}
	
