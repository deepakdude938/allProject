import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		// option.addArguments("--able-notifications");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.icicibank.com/");
		driver.findElement(By.xpath("//*[@id=\"push-modal-close\"]")).click();

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Get in Touch']")));
		action.moveToElement(driver.findElement(By.xpath("//a[text()='About Us']"))).contextClick();
		action.build().perform();

	}

}
