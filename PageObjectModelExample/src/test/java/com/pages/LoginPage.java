package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	public WebElement username;
	private WebElement password;
	private WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		HomePage home=new HomePage();
		return home;
		
	}

}
