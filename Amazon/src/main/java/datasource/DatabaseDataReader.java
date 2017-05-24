package datasource;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import search.SearchPage;
import utility.reader.ConnectDB;
import utility.reporting.TestLogger;

import java.util.List;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
public class DatabaseDataReader extends CommonAPI {

    public void dataFromDatabase()throws Exception,InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        ConnectDB connectDB = new ConnectDB();
        List<String> list = connectDB.readDataBase();
        for(String data:list){
           searchPage.searchFor(data);
           sleepFor(2);
           searchPage.clearSearchInput();
        }
    }
}
