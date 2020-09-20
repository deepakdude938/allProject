package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
