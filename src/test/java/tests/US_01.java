package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class US_01 {

    @Test
    public void googleTest(){
        Driver.getDriver().get("https://www.google.com");
    }
}
