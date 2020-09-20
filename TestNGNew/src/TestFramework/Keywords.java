/*
 * Project Name -FrameWork
 * Author-Deepak
 * client-Testing shastra
 * organization-
 */


package TestFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	public static WebDriver driver;
//	Logger log=Logger
			
			
	public static void keyword(String openBrowser) {
		switch (openBrowser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "IE":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;

		default:
			System.out.println("Unable to load browser");
			break;
		}
}
	/**
	 * It opens the specified url in web browser recently opened by driver instance
	 * @return void
	 * @author Deepak Dude
	 */
	
	
	public static void openUrl() {
		driver.get("https://www.facebook.com");
	}
	
	public static WebElement getWebElement(String locatorType,String locatorValue) {
	WebElement element=null;
		switch(locatorType) {
		
		case "XPATH":
		element=driver.findElement(By.xpath(locatorValue));
			break;

		case "CSS":
			element=driver.findElement(By.cssSelector(locatorValue));
			break;

		case "ID":
			element=driver.findElement(By.id(locatorValue));
			break;

		case "LINKTEXT":
			element=driver.findElement(By.linkText(locatorValue));
			break;

		case "PARTIALLINKTEXT":
			element=driver.findElement(By.partialLinkText(locatorValue));
			break;
			default:
				System.err.println("Invalid Locator Type");
		}

		return element;
	}
	
	public static void enterText(String locatorType,String locatorValue,String textToEnter) {
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);
		
	}
	
	public static void clickOnElement(String locatorType,String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}
	
	public void selectValueFromDropdown(String locatorType,String locatorValue,String textToSelect) {
		WebElement element=getWebElement(locatorType, locatorValue);
		Select select=new Select(element);
		select.selectByVisibleText(textToSelect);
		
		
	}

}
