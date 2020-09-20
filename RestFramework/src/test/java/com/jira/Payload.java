package com.jira;

public class Payload {

	public static String createSessionPayload = "{  \r\n" + "    \"username\":\"deepakdude938\",  \r\n"
			+ "    \"password\": \"Test@123\"  \r\n" + " }\r\n" + "\r\n" + "";

	public static String createTicketPayload = "{\r\n" + "    \"fields\": {\r\n" + "       \"project\":\r\n"
			+ "       {\r\n" + "          \"key\": \"JIR\"\r\n" + "       },\r\n"
			+ "       \"summary\": \"Creating a new story for false ceiling 123\",\r\n"
			+ "       \"description\": \"Living room false ceiling\",\r\n" + "       \"issuetype\": {\r\n"
			+ "          \"name\": \"Story\"\r\n" + "       }\r\n" + "   }\r\n" + "}";

}


