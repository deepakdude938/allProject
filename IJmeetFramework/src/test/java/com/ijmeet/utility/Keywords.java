package com.ijmeet.utility;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	public static WebDriver driver;
	public static Logger log=Logger.getLogger(Keywords.class);

	/**
	 * This method will open specified browser i.e. CHROME or INTERNET EXPLORER or
	 * FIREFOX
	 * 
	 * @param openBrowser
	 */
	public static void keyword(String openBrowser) {
		switch (openBrowser) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		default:
			break;
		}

	}

	public static void openBrowser(String url) {
		driver.get(url);
	}
	
	public WebElement  getWebElement() {
		
		
		
		return null;

	}
	/**
	 * This method will click on specified element
	 * @param locatorType
	 * @param locatorValue
	 */
	public static void clickOnElement(String locatorType,String locatorValue) {
		
		switch (locatorType) {
		case "XPATH":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
			
		case "CSS":
			driver.findElement(By.cssSelector(locatorValue)).click();
			break;
			
		case "NAME":
			driver.findElement(By.name(locatorValue)).click();
			break;
			
		case "CLASSNAME":
			driver.findElement(By.className(locatorValue)).click();
			break;
			
		case "LINKTEXT":
			driver.findElement(By.linkText(locatorValue)).click();
			break;
			
		case "PARTIALLINKTEXT":
			driver.findElement(By.partialLinkText(locatorValue)).click();
			break;
			
		case "ID":
			driver.findElement(By.id(locatorValue)).click();
			break;
			
		case "TAGNAME":
			driver.findElement(By.tagName(locatorValue)).click();
			break;
		default:
			System.out.println("Specified element is not valid");
			break;
		}
		
	}
	
	public void enterText(String locatorType,String locatorValue,String Text) {
		if(locatorType=="XPATH") {
			driver.findElement(By.xpath(locatorValue)).sendKeys(Text);
		}
		else if(locatorType=="CSS") {
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(Text);
		}
		else if(locatorType=="ID") {
			driver.findElement(By.id(locatorValue)).sendKeys(Text);
		}
		else if(locatorType=="NAME") {
			driver.findElement(By.name(locatorValue)).sendKeys(Text);
		}
		else if(locatorType=="CLASSNAME") {
			driver.findElement(By.className(locatorValue)).sendKeys(Text);
		}
		else if(locatorType=="LINKTEXT") {
			driver.findElement(By.linkText(locatorValue)).sendKeys(Text);
		}
		else if(locatorType=="PARTIALINKTEXT") {
			driver.findElement(By.partialLinkText(locatorValue)).sendKeys(Text);
		}
		else if(locatorType=="TAGNAME") {
			driver.findElement(By.tagName(locatorValue)).sendKeys(Text);
		}
		else {
			System.out.println("Given locator is invalid");
		}
	}

}
