package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class SetUp {
	String env="";
	String baseurl="";
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeSuite
	public void OpenBrowser(String browserName) {
		
		System.out.println("launching browser");
		env=System.getProperty("env");
		if(env.equals("beta")) {
			baseurl="http://beta.testingshastra.com";
		}
		else if(env.equals("dev")) {
			baseurl="http;//dev.testingshastra.com";
		}
		
		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			 driver=new InternetExplorerDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
		default:
			System.out.println("invalid browser");
			break;
			
		}
		
		
		driver.get("http://www.testingshastra.com/");
		System.out.println("Opening a browser");
	}
	
	
	
	@BeforeSuite
	public void signIn(){
		System.out.println("beforesuite");
		
	}
	
	@AfterSuite
	public void sign(){
		System.out.println("aftersuite");
		
	}

	
	
	@BeforeClass
	public void signup(){
		System.out.println("beforeClass");
		
	}
}
