package SeleniumIndustry;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("deepakpatil@gmail.com");
	//	driver.findElement(By.name("SubmitCreate"));
		
		
	}

}
