package BasicSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\Archana Gaikwad\\Desktop\\drop.html");
	//	driver.findElement(By.cssSelector("*[name='fname']")).sendKeys("Raghuram");
	//	driver.findElement(By.cssSelector("*[name='lname']")).sendKeys("Rajan");
		
		Select select=new Select(driver.findElement(By.tagName("select")));
		select.selectByVisibleText("Pune");			

		
	//	select.selectByIndex(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='123']")));
		
		driver.findElement(By.xpath("//a[@href='http://testingshastra.com/pages/Assignments.html']")).click();
		
//		driver.findElement(By.xpath("//a[text()=' simple alert']")).click();
		
		try {
		select.selectByVisibleText("Pune");
		}
		catch(StaleElementReferenceException e) {
		//	driver.switchTo().parentFrame();
			driver.navigate().refresh();
			Thread.sleep(20000);
			select.selectByVisibleText("Mumbai");			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	select.selectByVisibleText("Mumbai");
	//	List q=select.getOptions();
	//List p=	select.getAllSelectedOptions();
	
	//System.out.println(p);
	
		
	
 /*   Iterator itr=q.iterator();		
     while(itr.hasNext()) {
     	System.out.println(itr.next());
	//	select.deselectAll();
*/
//	}

}
}
