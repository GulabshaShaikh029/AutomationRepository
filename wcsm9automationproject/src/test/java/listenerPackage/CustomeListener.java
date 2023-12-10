package listenerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener{//basetest from listener package
   //to call methods right click and source and click on override/implements/methods
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("onTestFailure",true);
		String failedMethodName = result.getMethod().getMethodName();
		Reporter.log("method Failed ScreenShot Taken:"+failedMethodName,true);
		failedSsMethod(failedMethodName);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("onTestSkipped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("onFinish",true);
	}
	

}
