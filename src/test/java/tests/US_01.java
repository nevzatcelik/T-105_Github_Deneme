package tests;

import org.testng.annotations.Test;
import utilities.Driver;

public class US_01 {

    @Test
    public void googleTest(){
        System.out.println("bu satırı ekleyen ilker cakışması için");
        System.out.println("acele ekledim");
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().navigate().to("https://www.amazon.com");
    }
}
