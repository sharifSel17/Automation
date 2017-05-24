package searchitems;

import base.CommonAPI;
import datasource.DatabaseDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
public class SearchItemsWithDatabaseDataSource extends CommonAPI {

    @Test
    public void searchItemsWithDB()throws Exception, InterruptedException{
        ApplicationLog.epicLogger("Epic: Metro EC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        DatabaseDataReader databaseDataReader = PageFactory.initElements(driver, DatabaseDataReader.class);
        databaseDataReader.dataFromDatabase();
    }

}
