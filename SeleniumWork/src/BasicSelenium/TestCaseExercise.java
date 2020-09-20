package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCaseExercise {
	
	private static void login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[Id=email]")).sendKeys("xxxxxxxxxxxx");
		driver.findElement(By.cssSelector("input[Id=pass]")).sendKeys("yyyyyyyyyyyy");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		

	}
	private static void facebookSignUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Reyansh");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Patil");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9999999999999999");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("OOOOOOOOOOO");
		
	Select s=new Select(	driver.findElement(By.cssSelector("select[id='day']")));
	s.selectByValue("7");
	Select p=new Select(	driver.findElement(By.cssSelector("select[id='month']")));
	p.selectByVisibleText("May");
	Select r=new Select(	driver.findElement(By.cssSelector("select[id='year']")));
	r.selectByValue("2020");
	
	driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
	
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

	public static void main(String[] args) {
		TestCaseExercise test=new TestCaseExercise();
	//	test.login_Page();
		
		test.facebookSignUp();
		
		
	}

}
