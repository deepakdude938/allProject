package airtel_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
	}

}
