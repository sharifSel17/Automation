package amazonHome;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Sharif on 5/16/2017.
 */
public class AmazonTestMenu extends CommonAPI{
    @Test
    public void amazonTitle1(){
        String actualTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualTitle,driver.getTitle());
        System.out.println(driver.getTitle());
    }
    /*@Test
    public void amazonTitle2(){
        String actualTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(actualTitle,driver.getTitle());
        System.out.println(driver.getTitle());
    }*/
}
