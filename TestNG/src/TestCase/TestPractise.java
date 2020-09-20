package TestCase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPractise {
	@Test(dependsOnMethods = "m11")
	public void m123() {
		System.out.println("Test");
	}
	
	@Test(enabled=true)
	public void m11() {
		System.out.println("Test12");
	Assert.assertEquals("hi", "hi");
	}
	
	
	@BeforeSuite
	public void m2() {
		System.out.println("Beforesuite");
	}
	
	@AfterSuite
	public void m3() {
		System.out.println("AftrSuite");
	}
	@BeforeTest

	public void m4() {
		System.out.println("beforetest ");
		
	}
	
	@AfterTest

	public void m5() {
		System.out.println("aftertest ");
	}
	
	
	@AfterClass

	public void m6() {
		System.out.println("afterclass ");
	}
	@BeforeClass

	public void m7() {
		System.out.println("beforecls ");
	}
	

	
	
	
	
	
//	https://dl.bintray.com/testng-team/testng-eclipse-release

}
