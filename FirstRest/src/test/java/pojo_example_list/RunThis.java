package pojo_example_list;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.http.ContentType;

public class RunThis {
	public static void main(String[] args) {
		
		CourseDetails selenium=new CourseDetails();
		selenium.setTitle("Selenium");
		selenium.setPrice(4000);
		
		CourseDetails cyprus=new CourseDetails();
		cyprus.setTitle("Cyprus");
		cyprus.setPrice(3000);
		
		CourseDetails protractor=new CourseDetails();
		protractor.setTitle("Protractor");
		protractor.setPrice(2000);
		
		
		CourseDetails restAPI=new CourseDetails();
		restAPI.setTitle("Rest API");
		restAPI.setPrice(1500);
		
		CourseDetails soapUI=new CourseDetails();
		soapUI.setTitle("Soap UI");
		soapUI.setPrice(2000);
		
		CourseDetails cTest=new CourseDetails();
		cTest.setTitle("C-Test");
		cTest.setPrice(3000);
		
		CourseDetails appium=new CourseDetails();
		appium.setTitle("Appium");
		appium.setPrice(2500);
		
		List <CourseDetails> webautomation=new ArrayList<CourseDetails>();
		webautomation.add(selenium);
		webautomation.add(cyprus);
		webautomation.add(protractor);
		
		List <CourseDetails> api=new ArrayList<CourseDetails>();
		api.add(restAPI);
		api.add(soapUI);
		
		List <CourseDetails> mobileautomation=new ArrayList<CourseDetails>();
		mobileautomation.add(cTest);
		mobileautomation.add(appium);
		
		DashBoard dashboard=new DashBoard();
		dashboard.setPurchaseAmount(18000);
		dashboard.setWebsite("www.testingshastra.com");
		
		Courses courses=new Courses();
		courses.setWebautomation(webautomation);
		courses.setApi(api);
		courses.setMobileautomation(mobileautomation);
		
		Tution tution=new Tution();
		tution.setDashboard(dashboard);
		tution.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.body(tution)
		.log().all()
 		.when()
		.post("https://gorest.co.in/public-api/users")
		.then()
		.log().all();
	
	}

}