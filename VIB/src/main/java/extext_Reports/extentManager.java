package extext_Reports;

import com.aventstack.extentreports.ExtentReports;
import  com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentManager {
    private static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports getExtentReports(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReports/ExtentReport.html");
        reporter.config().setReportName("Demo Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Framework Name","Selenium Java Framework | VIB");
        extentReports.setSystemInfo("Author", "VIB");
        return extentReports;

    }
}
