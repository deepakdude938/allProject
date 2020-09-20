package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPractise1 {
	
	@Test(groups= {"function"})
	public void m1() {
		System.out.println("Test11");
	}
	
	
	@Test(groups= {"fun"})
	public void m9() {
		System.out.println("Test11");
	}
	@BeforeSuite
	public void m2() {
		System.out.println("Beforesuite111");
	}
	
	@AfterSuite
	public void m3() {
		System.out.println("AftrSuite1111");
	}
	
	
	
	@AfterClass

	public void m6() {
		System.out.println("afterclass1111");
	}
	@BeforeClass

	public void m7() {
		System.out.println("beforecls1111 ");
	}

}
