package actionRobotdemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		Thread.sleep(5000);
		WebElement s=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		Thread.sleep(5000);

		WebElement d=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(s,d);
		action.perform();



	}

}
