package utility.reporting;

import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;

/**
 * Created by Sharif on 5/19/2017.
 */
public class ExtentManager {
    private static ExtentReports extent;
    private static ITestContext context;

    public synchronized static ExtentReports getInstance() {
        if (extent == null) {
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(), "html");
            extent = new ExtentReports(System.getProperty("user.dir") + "/Extent-Report/Report.html", true);
            Reporter.log("Extent Report directory: " + resultDirectory, true);
            extent.addSystemInfo("Host Name" , "com")
                    .addSystemInfo("Environment", "SA")
                    .addSystemInfo("User Name", "sharif-uddin");
            extent.loadConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
        }

        return extent;
    }


    public static void setOutputDirectory(ITestContext context) {
        ExtentManager.context = context;
    }
}
