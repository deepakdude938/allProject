import org.testng.annotations.BeforeSuite;

public class SetUp {
	@BeforeSuite
	public void signIn(){
		System.out.println("beforesuite");
		
	}

}
