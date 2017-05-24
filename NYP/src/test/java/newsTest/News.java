package newsTest;

import base.CommonAPI;
import newsPage.NewsPageMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Sharif on 5/16/2017.
 */
@Test
public class News extends CommonAPI {
    public void headlineNews(){
        ApplicationLog.epicLogger("Epic: News EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-1> GREEN-1 </a>");
        NewsPageMenu newsPageRecord = PageFactory.initElements(driver, NewsPageMenu.class);
        newsPageRecord.clickOnHeadLine();
    }
}
