package airtel_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Airtel {
	public static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.airtel.in/");
		// driver.manage().deleteAllCookies();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-block']")).click();
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}	
	@Test
	public void homePage() {
		String url = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/";
		Assert.assertEquals(url, actualUrl);
		System.out.println("HomePage is Available for Airtel");
	}
	@Test
	public void logoVisibility() {

		driver.findElement(By.xpath("//img[@class='brand']")).click();
		String expectedUrl = "https://www.airtel.in/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Airtel logo is available at Left corner of homepage");
	}

	@Test
	public void titleChecking() {

		String expectedTitle = driver.getTitle();
		System.out.println(expectedTitle);
		String actualTitle = "Airtel 4G - Prepaid | Postpaid | Broadband | Payments Bank| DTH";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title matched");

	}

	@Test
	public void xstremLinkVerification() {
		driver.findElement(By.xpath("//a[@data-analytics='header|Xstream']")).click();
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtelxstream.in/?icid=header";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Xstream text link is available");

	}

	@Test
	public void airtelPaymentBankLinkVerification() {
		driver.findElement(By.xpath("//div/a[text()='Airtel Payments Bank']")).click();
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/bank/?icid=header";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("AirtelPaymentsBank text link is available");

	}

	@Test
	public void wynkLinkVerification() {
		driver.findElement(By.xpath("//div/a[text()='Wynk']")).click();
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://wynk.in/music?icid=header";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Wynk text link is available");

	}

	@Test
	public void careerLinkVerification() {
		driver.findElement(By.xpath("//div/a[text()='Career']")).click();
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/careers/?icid=header";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Career text link is available");

	}

	@Test
	public void personalTextVerification() {
		String text = driver.findElement(By.xpath("//div/a[text()='Personal']")).getText();
		System.out.println(text);
		String actualText = "Personal";
		Assert.assertEquals(text, actualText);
		System.out.println("Personal text is available");

	}

	@Test
	public void businessLinkVerification() {
		driver.findElement(By.xpath("//div/a[text()='Business']")).click();
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/business/#/?icid=header";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Business text link is available");

	}

	@Test
	public void investorLinkVerification() {
		driver.findElement(By.xpath("//div/a[text()='Investor']")).click();
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/about-bharti/equity?icid=hheader";
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Investor text link is available");

	}

	@Test
	public void popUpBoxVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//div[@class='moe-popup-container']")).isDisplayed();
		Assert.assertTrue(condition);
		System.out.println("Pop-Up Box Available");
	}

	@Test
	public void popUpBoxText1VisibilityTest() {

		String text1 = driver.findElement(By.xpath("//div[@class='moe-text-container']/h3")).getText();
		String expectedText = "Keep up-to-date & get notified!";
		Assert.assertEquals(text1, expectedText);
		;
		System.out.println("Keep up-to-date & get notified! Text is available on popup Box");
	}

	@Test
	public void popUpBoxText2VisibilityTest() {

		String text2 = driver.findElement(By.xpath("//div[@class='moe-text-container']/p")).getText();
		System.out.println(text2);
		String expectedText = "You can turn these off anytime you want";
		Assert.assertEquals(text2, expectedText);
		;
		System.out.println("You can turn these off anytime you want Text is available on popup Box");
	}

	@Test
	public void popUpBoxLogoVisibilityTest() {

		boolean condition = driver.findElement(By.xpath(
				"//div/img[@src='https://assets.airtel.in/static-assets/new-home/img/airtel-red.svg?v=1598336820438']"))
				.isDisplayed();
		Assert.assertTrue(condition);
		;
		System.out.println("Logo is available on popup Box");
	}

	@Test
	public void popUpBoxDontAllowButtonVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-block']")).isDisplayed();
		Assert.assertTrue(condition);
		driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-block']")).click();
		boolean condition1 = driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-block']")).isDisplayed();
		Assert.assertFalse(condition1);
		System.out.println("Dont Allow button is available on popup Box and it is clickable");
	}

	@Test
	public void popUpBoxAllowButtonVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-allow']")).isDisplayed();
		Assert.assertTrue(condition);
		driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-allow']")).click();
		boolean condition1 = driver.findElement(By.xpath("//button[@class='moe-btn moe-btn-allow']")).isDisplayed();
		Assert.assertFalse(condition1);
		System.out.println("Allow button is available on popup Box and it is clickable");
	}

	@Test
	public void leftArrowVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//div[@class='slider-controls left']/img")).isDisplayed();
		Assert.assertTrue(condition);
		driver.findElement(By.xpath("//div[@class='slider-controls left']/img")).click();
		System.out.println("Left arrow is available on slider-container of homepage");
	}

	@Test
	public void rightArrowVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//div[@class='slider-controls right']/img")).isDisplayed();
		Assert.assertTrue(condition);
		driver.findElement(By.xpath("//div[@class='slider-controls right']/img")).click();
		System.out.println("Right arrow is available on slider-container of homepage");
	}

	@Test
	public void getAppImageLinkVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//a[@data-analytics='header|Get App']")).isDisplayed();
		Assert.assertTrue(condition);
		driver.findElement(By.xpath("//a[@data-analytics='header|Get App']")).click();
		String expectedurl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/airtel-thanks-app?icid=header";
		Assert.assertEquals(expectedurl, actualUrl);
		System.out.println("Get App image link is available on slider-container of homepage");
	}

	@Test
	public void airtelStoreImageLinkVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//a[@data-analytics=\"header|Airtel Store\"]")).isDisplayed();
		Assert.assertTrue(condition);
		driver.findElement(By.xpath("//a[@data-analytics=\"header|Airtel Store\"]")).click();
		String expectedurl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/store/";
		Assert.assertEquals(expectedurl, actualUrl);
		System.out.println("Airtel Store image link is available on slider-container of homepage");
	}

	@Test
	public void loginImageLinkVisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//a[@data-analytics=\"header|Login\"]")).isDisplayed();
		Assert.assertTrue(condition);
		driver.findElement(By.xpath("//a[@data-analytics=\"header|Login\"]")).click();
		String expectedurl = driver.getCurrentUrl();
		String actualUrl = "https://www.airtel.in/s/selfcare?normalLogin";
		Assert.assertEquals(expectedurl, actualUrl);
		System.out.println("Login image link is available on slider-container of homepage");
	}

	@Test
	public void prepaidImageLink_VisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//li[@data-analytics=\"recharge rail-Prepaid\"]"))
				.isDisplayed();
		Assert.assertTrue(condition);
		System.out.println("Prepaid image link is available on recharge-tab");
	}

	@Test
	public void postpaidImageLink_VisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//li[@data-analytics=\"recharge rail-Postpaid\"]"))
				.isDisplayed();
		Assert.assertTrue(condition);
		System.out.println("Postpaid image link is available on recharge-tab");

	}

	@Test
	public void dthImageLink_VisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//li[@data-analytics=\"recharge rail-DTH\"]")).isDisplayed();
		Assert.assertTrue(condition);
		System.out.println("DTH image link is available on recharge-tab");

	}

	@Test
	public void broadbandImageLink_VisibilityTest() {

		boolean condition = driver.findElement(By.xpath("//li[@data-analytics=\"recharge rail-Broadband\"]"))
				.isDisplayed();
		Assert.assertTrue(condition);
		System.out.println("Broadband image link is available on recharge-tab");

	}

	@Test
	public void rechargeTabText1_VisibilityTest() {

		String text1 = driver.findElement(By.xpath("//div[@class=\"recharge-left\"]/h4")).getText();
		String expectedText = "Recharge & Pay bills";
		Assert.assertEquals(text1, expectedText);
		System.out.println("Recharge & Pay bills Text is available on Recharge Tab");
	}



	@Test
	public void rechargeTabText2_VisibilityTest() {

		String text1 = driver.findElement(By.xpath("//div[@class=\"recharge-left\"]/p")).getText();
		System.out.println(text1);
		String expectedText = "Get exciting cashback and offers";
		Assert.assertEquals(text1, expectedText);
		System.out.println("Get exciting cashback and offers Text is available on Recharge Tab");
	}
	@Test
	public void rechargeTab_EnterMobNoTextBox_VisibilityTest() {
		
		driver.findElement(By.xpath("//li[@data-analytics=\"recharge rail-Prepaid\"]")).click();
		String text1 = driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).getAttribute("placeholder");
		System.out.println(text1);
		Assert.assertEquals(text1, "Enter mobile number");
		driver.findElement(By.xpath("//input[@id='quickRechargeInput']")).sendKeys("8888888888");
		System.out.println("EnterMobNO TextBox is available on Recharge Tab");
	}
	@Test
	public void rechargeTab_RegisterMobIDTextBox_VisibilityTest() {
		
		driver.findElement(By.xpath("//li[@data-analytics=\"recharge rail-DTH\"]")).click();
		String text1 = driver.findElement(By.xpath("//input[@placeholder='Registered mobile/ID']")).getAttribute("placeholder");
		System.out.println(text1);
		Assert.assertEquals(text1, "Registered mobile/ID");
		 driver.findElement(By.xpath("//input[@placeholder='Registered mobile/ID']")).sendKeys("9856320236");
		System.out.println("Registered mobile/ID TextBox is available on Recharge Tab");
	}
	
	@Test
	public void rechargeTab_RECHARGE_Button_VisibilityTest() {
		
		driver.findElement(By.xpath("//li[@data-analytics='recharge rail-Prepaid']")).click();
		driver.findElement(By.xpath("//input[@id='quickRechargeInput']")).sendKeys("8888888888");
	//	driver.findElement(By.xpath("//button[text()='RECHARGE']")).click();
		String expectedTitle=driver.getTitle();
		System.out.println(expectedTitle);
		String actualTitle="Online Mobile Recharge, Prepaid Mobile Recharge - Airtel";
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Recharge button is available on Recharge Tab and it is clickable");
	}
	@Test
	public void rechargeTab_PAYBILL_Button_VisibilityTest() {
		
		driver.findElement(By.xpath("//li[@data-analytics='recharge rail-Postpaid']")).click();
		driver.findElement(By.xpath("//input[@id='quickRechargeInput']")).sendKeys("8888888888");
		driver.findElement(By.xpath("//button[text()='PAY BILL']")).click();
		String expectedTitle=driver.getTitle();
		String actualTitle="Online Mobile Recharge, Prepaid Mobile Recharge - Airtel";
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("PAY BILL button is available on Recharge Tab and it is clickable");
	}
	@Test
	public void buyPrepaid_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-buy prepaid']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/prepaid-4g-sim/?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Buy Prepaid link is available on Quick Action Container");
	}
	
	@Test
	public void buyPostpaid_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-buy postpaid']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/myplan-infinity/?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Buy Postpaid link is available on Quick Action Container");
	}
	@Test
	public void buyBroadband_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-buy broadband']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/broadband/?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Buy Broadband link is available on Quick Action Container");
	}
	
	
	@Test
	public void buyDTH_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-buy dth']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/dth/Pune";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Buy DTH link is available on Quick Action Container");
	}
	@Test
	public void buyXstream_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-buy xstream']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/xstream/box?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Buy Xstream link is available on Quick Action Container");
	}
	@Test
	public void portToAirtelLink_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-port to airtel']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/mnp/?requirement=MNP&utm_source=MNP_direct&icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Port To Airtel link is available on Quick Action Container");
	}
	@Test
	public void oneAirtelPlan_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-One Airtel Plan']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/one-airtel-plan/?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("One Airtel Plan link is available on Quick Action Container and clickable");
	}
	@Test
	public void prepaidToPostpaidLink_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-prepaid to postpaid']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/myplan-infinity/?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Prepaid to Postpaid link is available on Quick Action Container");
	}
	@Test
	public void airtelPaymentsBank_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-airtel payments bank']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/bank/?utm_source=Internal&utm_medium=QuickAction&utm_campaign=Airtel&icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Airtel Payments Bank link is available on Quick Action Container and clickable");
	}
	@Test
	public void internationalRoamingLink_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-international roaming']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/ir-packs/?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("International Roaming link is available on Quick Action Container");
	}
	@Test
	public void businessPostpaidLink_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-business postpaid']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/business/b2b/postpaid-with-g-suite";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Business Postpaid link is available on Quick Action Container and clickable");
	}
	
	@Test
	public void wificallingLink_QuickActionContainer_VisibilityTest() {
		
		driver.findElement(By.xpath("//a[@data-analytics='airtel services-wifi calling']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airtel.in/wifi-calling?icid=quick_action";
		Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Wifi Calling link is available on Quick Action Container and clickable");
	}
}
