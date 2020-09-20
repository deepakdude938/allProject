package SeleniumIndustry;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelectorPractise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
	//	driver.findElement(By.cssSelector("select[Id='dropdown-class-example']")).click();	
		
		Select select=new Select(driver.findElement(By.cssSelector("select[Id='dropdown-class-example']")));
		select.selectByIndex(2);;
	}

}
