package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getExtentReports() {

        if (extent == null) {
            ExtentSparkReporter spark =
                    new ExtentSparkReporter("reports/AutomationReport.html");

            spark.config().setReportName("SauceDemo Automation Report");
            spark.config().setDocumentTitle("Automation Test Results");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "Selenium Java TestNG Framework");
            extent.setSystemInfo("Tester", "Wajid Ali");
            extent.setSystemInfo("Browser", "Chrome");
        }

        return extent;
    }
}