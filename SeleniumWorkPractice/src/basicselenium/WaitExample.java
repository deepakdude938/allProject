package basicselenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		FluentWait wait=new FluentWait(driver);
		WebDriverWait w=new WebDriverWait(driver,1);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class,ArithmeticException.class);
		wait.withMessage("");
	}

}
