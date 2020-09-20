package com.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop=new Properties();
		
		
	}
	public static void initialization() {
		String browserName="chrome";
		String url="www.crm.com";
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	

}
