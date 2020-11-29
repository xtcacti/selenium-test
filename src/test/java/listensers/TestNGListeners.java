package listensers;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Test Start----" + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success----" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failure----" + result.getName());
    }

    public void onStart(ITestContext context) {
        System.out.println("Start----" + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("Finish----" + context.getName());
    }
}
