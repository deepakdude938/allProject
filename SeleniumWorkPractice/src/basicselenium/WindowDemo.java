package basicselenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		Set<String> handles=driver.getWindowHandles();
	String s=	driver.getTitle();
//1.	System.out.println(s);
		
		  for(String handle:handles) {
		  if(!driver.switchTo().window(handle).getTitle().equals(s)) {
		System.out.println(driver.switchTo().window(handle).getTitle());	  
//			  driver.close();
		  }
			  
		  
		  }
		 
	}

} 

