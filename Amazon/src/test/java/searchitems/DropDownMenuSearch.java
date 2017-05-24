package searchitems;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.DropDownMenuPage;
import utility.reporting.ApplicationLog;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
public class DropDownMenuSearch extends CommonAPI {

    @Test
    public void searchMenu()throws InterruptedException{
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        DropDownMenuPage dropDownMenuPage = PageFactory.initElements(driver, DropDownMenuPage.class);
        dropDownMenuPage.dropDownSearch();
    }

}
