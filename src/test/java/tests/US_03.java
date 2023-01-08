package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class US_03 {
    @Test
    public void test03(){
        Driver.getDriver().get("https://www.amazon.com");
    }
}
