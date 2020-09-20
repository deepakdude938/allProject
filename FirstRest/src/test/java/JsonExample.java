import io.restassured.path.json.JsonPath;

public class JsonExample {

	public static void main(String[] args) {
		/*
		 * String
		 * s="{\"dashboard\":{\"purchaseAmount\":\"38000\",\"website\":\"testingshastra.com\"},\"courses\":{\"webautomation\":[{\"title\":\"Selenium\",\"price\":5000},{\"title\":\"Python Selenium\",\"price\":6000},{\"title\":\"Headless Testing \",\"price\":2000}],\"api\":[{\"title\":\"Rest API\",\"price\":5000},{\"title\":\"Postman\",\"price\":6000},{\"title\":\"Postman\",\"price\":9000}],\"mobile\":[{\"title\":\"C-Test\",\"price\":5000}]}}"
		 * ; JsonPath json=new JsonPath(s);
		 *  String ss=json.getString("courses.webautomation[0].title"); 
		 *  System.out.println(ss);
		 */
		
		
		
		
		String s="{\"dashboard\":{\"purchaseAmount\":\"38000\",\"website\":\"testingshastra.com\"},\"courses\":[{\"title\":\"Selenium\",\"price\":9000},{\"title\":\"Python Selenium\",\"price\":1000},{\"title\":\"Headless Testing \",\"price\":4000},{\"title\":\"Rest API\",\"price\":6000},{\"title\":\"Postman\",\"price\":2000},{\"title\":\"Postman\",\"price\":1000},{\"title\":\"C-Test\",\"price\":8000}]}";
		JsonPath json=new JsonPath(s);
		int size =json.getInt("courses.size()");
		System.out.println(size);
		
		//To print all courses
		for(int i=0;i<size;i++) {

			System.out.println(json.getString("courses["+i+"].title"));
		}
		
		
		
		//To add courses fee
		int totalPrice=0;
		for(int i=0;i<size;i++) {
			totalPrice=totalPrice+json.getInt("courses["+i+"].price");
		}
		System.out.println(totalPrice);
		
		
		
		//To Verify Total price with Given Purchased Amount
		
		int purchaseAmount=json.getInt("dashboard.purchaseAmount");
		if(totalPrice==purchaseAmount) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
	}

}
