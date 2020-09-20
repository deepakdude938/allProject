package actionRobotdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PopupDemo {
	
	
	
		public void	dragAndDrop() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			//option.addArguments("--enable-notifications");
		//	option.addArguments("-incognito");

			
			WebDriver driver=new ChromeDriver(option);
			
		/*
		 * driver.get("C:\\Users\\Archana Gaikwad\\Desktop\\dragdrop.html"); //
		 * WebElement p=driver.findElement(By.
		 * xpath("//img[@src=\"img_w3slogo.gif\" and @id='drag1' and @alt='W3Schools']")
		 * ); WebElement s=driver.findElement(By.xpath("//div[@id='div1']")); WebElement
		 * p=driver.findElement(By.xpath("//div[@id='drag1']"));
		 * 
		 * Actions k=new Actions(driver); k.dragAndDrop(p, s); k.perform();
		 */

			driver.get("https://www.naukri.com/");
			Thread.sleep(25000);
			driver.findElement(By.xpath("//span[@id='block']")).click();
			System.out.println("1");
	
		}
		
	

	public static void main(String[] args) throws InterruptedException {
	
	new	PopupDemo().dragAndDrop();
	

	}

}
