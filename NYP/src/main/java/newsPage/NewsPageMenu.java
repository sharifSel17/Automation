package newsPage;

import base.CommonAPI;
import homePage.HomePageMenu;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by Sharif on 5/16/2017.
 */
public class NewsPageMenu extends CommonAPI {
    @FindBy(how = How.CSS, using = ".postid-10943106")
    public static WebElement newsHeader;

    public  WebElement getNewsHeader() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return newsHeader;
    }
    public void clickOnHeadLine(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePageMenu homePageRecord = PageFactory.initElements(driver, HomePageMenu.class);
        homePageRecord.clickOnNewsItem();
    }
}
