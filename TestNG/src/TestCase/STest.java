package TestCase;

import org.testng.annotations.Test;

public class STest {
	@Test(dataProvider="CredentialsData",dataProviderClass=DataFeeder1.class)
	public void credentials(String Name,String City,String College,Double MobNo)  {
		System.out.println(Name+"\t"+City+"\t"+College+"\t"+MobNo);
	}
	

}
