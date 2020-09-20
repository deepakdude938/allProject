package BasicSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DefaultBrowser {

	public static void main(String[] args) {
	 
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
/*
driver.get("file:///C:/Users/Archana%20Gaikwad/Desktop/sample.html");
System.out.println(driver.getTitle());
System.out.println(driver.getWindowHandles());
Set<String> s=driver.getWindowHandles();
System.out.println(s);
		
driver.manage().window().maximize();	
System.out.println(driver.getCurrentUrl());
WebElement username=driver.findElement(By.name("uname"));
username.sendKeys("abcdefg");
WebElement pword=driver.findElement(By.name("password"));
pword.sendKeys("12345");
WebElement button=driver.findElement(by)

driver.quit();
*/
/*
driver.get("/https://www.facebook.com");
driver.findElement(By.name("email")).sendKeys("deepakdude938@gmail.com");
driver.findElement(By.id("pass")).sendKeys("");
driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
driver.quit();


*/
String p="peter";
String q="parker";
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.xpath("//input[@maxlength='30']")).sendKeys(p);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(q);
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//input[@maxlength='30']")).clear();;
driver.findElement(By.xpath("//input[@type='password']")).clear();





	}

}
