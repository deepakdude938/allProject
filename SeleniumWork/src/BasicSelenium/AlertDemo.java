package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.testingshastra.com/");
		driver.findElement(By.xpath("//a[text()='Assignments']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[text()=' simple alert']")).click();

		driver.findElement(By.xpath("//input[@name=\"YourName\"]")).sendKeys("Raghav");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		a.dismiss();;
	}

}
