import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator {
	int x,y,r;
	@Given("take two numbers from user")
	public void acceptTwoNumbers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	@When("we add those numbers")
	public void addNumbers() {
		r=x+y;
	}
	@Then("addition result should be displayed")
	public void displayResult() {
		System.out.println("Result is"+r);
	}

}
