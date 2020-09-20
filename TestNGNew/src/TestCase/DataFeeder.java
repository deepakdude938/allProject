package TestCase;

import org.testng.annotations.DataProvider;

public class DataFeeder {
	@DataProvider(name="CredentialsData")
	public static Object[][] credentialsProvider() {
		
		
		Object[][] obj= {{"deepak","123"},
						 {"sudhir","325"}};
		
		return obj;
	}
	

}
