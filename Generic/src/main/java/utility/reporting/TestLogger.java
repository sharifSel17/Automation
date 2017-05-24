package utility.reporting;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.apache.commons.lang.StringUtils;
/**
 * Created by Sharif on 5/19/2017.
 */
public class TestLogger {
    public static void log(final String message) {
        Reporter.log(message, true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final StringUtils message) {
        Reporter.log(message + "<br>", true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final String message, WebDriver driver) {
        Reporter.log(message + "<br>", true);
        ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }
}
