package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result)

	{
		System.out.println("test case start");
	}

	public void onTestSucces(ITestResult result)

	{
		System.out.println("test case succes");
	}

	public void onTestFailure(ITestResult result)

	{
		System.out.println("test case fail");
	}

	public void onTestSkipped(ITestResult result)

	{
		System.out.println("test case skip");
	}
}
