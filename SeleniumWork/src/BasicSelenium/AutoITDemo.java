package BasicSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(15000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(10000);
	//	Runtime.getRuntime().exec("C:\\Users\\Archana Gaikwad\\Desktop\\_deepak_dude.exe");

	}

}
