package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class US_02 {
    @Test
    public void test01(){
        Driver.getDriver().get("https://facebook.com");
    }
}
