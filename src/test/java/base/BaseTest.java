package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.LoggerUtil;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        LoggerUtil.logger.info("========== Test Started ==========");

        driver = DriverFactory.getDriver();

        LoggerUtil.logger.info("Browser launched successfully");

        driver.get(ConfigReader.getProperty("baseUrl"));

        LoggerUtil.logger.info("Navigated to: " + ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {

        LoggerUtil.logger.info("Closing browser");

        DriverFactory.quitDriver();

        LoggerUtil.logger.info("========== Test Finished ==========");
    }
}