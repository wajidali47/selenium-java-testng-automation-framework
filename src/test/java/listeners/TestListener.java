package listeners;

import base.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ExtentManager;
import utils.ScreenshotUtil;

import java.lang.reflect.Field;

public class TestListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getExtentReports();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().fail(result.getThrowable());

        try {
            Object testClass = result.getInstance();

            Field driverField = BaseTest.class.getDeclaredField("driver");
            driverField.setAccessible(true);

            WebDriver driver = (WebDriver) driverField.get(testClass);

            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getName());

            test.get().addScreenCaptureFromPath("../" + screenshotPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }
}