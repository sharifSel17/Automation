package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Sharif on 5/17/2017.
 */

public class HomePage extends CommonAPI {
    @FindBy(how= How.XPATH,using = ".//*[@id='slick-slide00']/a/div[2]")
    public static WebElement selectHomeMenu;

    public WebElement getSelectHomeMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return selectHomeMenu;
    }
    public void clickOnMainMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectHomeMenu().click();
    }

}
