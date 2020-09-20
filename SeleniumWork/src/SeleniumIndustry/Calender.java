package SeleniumIndustry;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		Select select=new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1']")));
		select.selectByIndex(5);
		
	}

}
