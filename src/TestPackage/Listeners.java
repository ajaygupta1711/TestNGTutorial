package TestPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener is an Interface which implements TestNG listeners.

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	//	System.out.println("I successfully executed listeners pass code");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// Screenshot Code
		System.out.println("I successfully executed listeners pass code");
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
		
	  }

	@Override
	  public void onTestFailedWithTimeout(ITestResult result) {
	    
		onTestFailure(result);
		
	  }

	@Override
	  public void onStart(ITestContext context) {
	    
		
	  }

	@Override
	  public void onFinish(ITestContext context) {
	    
		
	  }
	
}
