package TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bouncycastle.x509.X509StoreSpi;
import org.testng.annotations.DataProvider;

public class DataFeeder {
	@DataProvider(name="CredentialsData")
	public static Object[][] credentialsProvider() {
		
		
		Object[][] obj= {{"deepak","123"},
						 {"sudhir","325"}};
		
		return obj;
	}

}
