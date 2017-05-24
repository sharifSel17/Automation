package utility.reporting;
import utility.reporting.TestLogger;
/**
 * Created by Sharif on 5/19/2017.
 */
public class ApplicationLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("Launch local browser Instance");
    }
}
