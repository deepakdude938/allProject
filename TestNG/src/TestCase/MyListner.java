package TestCase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("On Finish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("On Start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("On Finish Percentage");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("On Failure");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("On Skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("On Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("On Test Success");
		
	}

}
