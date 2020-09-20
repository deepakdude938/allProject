package com.jira;

import io.restassured.RestAssured;

public class TestBase {
	public static final String SESSION_URL = "rest/auth/1/session";
	public static final String CREATE_TICKET = "rest/api/2/issue";
	public static final String uploadFile = "rest/api/2/issue/JIR-4/attachments";

	// RestAssured.="http://localhost:8080/";
	public static void restAssuredURL() {
		RestAssured.baseURI = "http://localhost:8080/";

	}
}
