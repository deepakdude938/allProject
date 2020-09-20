package com.pojo;
import static io.restassured.RestAssured.given;
/**
 * 12-9
 * @author abc
 *
 */
public class PojoExample {
	public static void main(String[] args) {
		Bedrroom bedroom=new Bedrroom();
		bedroom.setAc("Daikin");
		bedroom.setAlmirah("Godrej");
		
		Hall hall=new Hall();
		hall.setSofa("HomeDecor");
		hall.setTv("samsung");
		
		Kitchen kitchen=new Kitchen();
		kitchen.setFridge("kelvinator");
		kitchen.setMicrowave("IFB");
		kitchen.setGassstove("sleek");
		
		ExampleJsonObject obj=new ExampleJsonObject();
		obj.setHall(hall);
		obj.setBedroom(bedroom);
		obj.setKitchen(kitchen);
		obj.setAddress("Kothrud");;
		
		given()
		.log().all()
		.contentType("application/json")
		.body(obj)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log().all();
		
	}
	

}