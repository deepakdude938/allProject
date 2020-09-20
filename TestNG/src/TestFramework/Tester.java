package TestFramework;

import org.testng.annotations.Test;

public class Tester {
	@Test
	public void m1() {
		Keywords.keyword("Chrome");
		Keywords.openUrl();
		Keywords.enterText("XPATH", locatorValue, "deepak@gmail.com");
		Keywords.enterText(locatorType, locatorValue, textToEnter);
		Keywords.clickOnElement(locatorType, locatorValue);
		
	}

}
