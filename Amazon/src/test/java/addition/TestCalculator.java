package addition;

import org.junit.Assert;

/**
 * Created by Sharif on 5/16/2017.
 */
public class TestCalculator {
    public static void main(String[] args) {
        Calculator sum = new Calculator();
        int total = sum.addition(15,20);
        Assert.assertEquals(total,35);
    }
}
