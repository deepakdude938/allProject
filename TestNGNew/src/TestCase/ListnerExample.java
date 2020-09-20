package TestCase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListner.class)
public class ListnerExample {
	
	@Test
	public void  m1() {
		System.out.println("first Test Case");
	}

	@Test(dependsOnMethods="m3")
	public void  m2() {
		System.out.println("second Test Case");
	}
	
	@Test
	public void  m3() {
		System.out.println("third Test Case");
		Assert.assertEquals("hi", "hio");
	}


}
