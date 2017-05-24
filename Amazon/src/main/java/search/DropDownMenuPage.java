package search;

import base.CommonAPI;
import utility.reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
 public class DropDownMenuPage extends CommonAPI {

        public List<String> getMenus(){
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> items = new ArrayList<String>();
            items = getTextFromWebElements("#searchDropdownBox option");
            return items;
        }

        public void typeOnInputSearch(List<String> data)throws InterruptedException{
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            for(int i=0; i<5; i++) {
                typeByCss("#twotabsearchtextbox", data.get(i));
                input();
                sleepFor(2);
                clearBox();
            }
        }

        public void input() {
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            keysInput("#twotabsearchtextbox");
        }
        public void clearBox() {
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            clearInput("#twotabsearchtextbox");
        }

        public void dropDownSearch()throws InterruptedException{
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> items = getMenus();
            typeOnInputSearch(items);
        }
}
