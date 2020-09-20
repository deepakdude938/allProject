package com.testcases;

import org.testng.annotations.BeforeMethod;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	private HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("abc", "abcd");
	}
	
	private void verifyHomePageTitleTest() {
		homePage.ver
	}
	
	
	

	public void tearDown() {
		driver.quit();
	}

}
