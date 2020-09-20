package TestCase;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class SanityTesting {
	@Test(expectedExceptions = FileNotFoundException.class)
	public void	m1() {
		System.out.println("Sanity-Testing 1");
		System.out.println(10/0);
	}
	public void	m2() {
		System.out.println("Sanity-Testing 2");
	}
	public void	m3() {
		System.out.println("Sanity-Testing 3");
	}

}
