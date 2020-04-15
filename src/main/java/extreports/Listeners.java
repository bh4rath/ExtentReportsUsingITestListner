package extreports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {

	ExtentReports extent = ExtentReportsNG.extentReportGenerator();
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case Pased");
	}

	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
