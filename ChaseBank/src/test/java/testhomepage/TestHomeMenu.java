package testhomepage;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;
import utility.reporting.TestLogger;

/**
 * Created by Sharif on 5/17/2017.
 */


public class TestHomeMenu extends CommonAPI {
    @Test
    public void mainMenu(){
        ApplicationLog.epicLogger("Epic: News EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-1> GREEN-1 </a>");
        HomePage homeP = PageFactory.initElements(driver,HomePage.class);
        homeP.clickOnMainMenu();
    }
}
