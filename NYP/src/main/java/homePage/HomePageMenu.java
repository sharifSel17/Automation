package homePage;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import utility.reporting.TestLogger;
/**
 * Created by Sharif on 5/16/2017.
 */
public class HomePageMenu extends CommonAPI {
    @FindBy(how = How.CSS, using = "#nav-wrapper .container #page-nav .nav-links .nav-links-wrapper .nav-left #sections .menu-icon svg:only-child")
    public static WebElement sectionsMenu;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(1)")
    public static WebElement sectionsMenuNews;

    public WebElement getSectionsMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " +converToString (new Object(){}.getClass().getEnclosingMethod().getName()));
        return sectionsMenu;
    }
    public WebElement getSectionsMenuList() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return sectionsMenuNews;
    }
    public void clickOnSectionsMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsMenu().click();
    }
    public void clickOnNewsItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSectionsMenu();
        getSectionsMenuList().click();
    }


}
