package amazonHome;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Sharif on 5/16/2017.
 */
public class SearchItem extends CommonAPI{
    @Test
    public void search(){
        typeByCss("#twotabsearchtextbox","laptop");
        clickByCss(".nav-input");
    }
}
