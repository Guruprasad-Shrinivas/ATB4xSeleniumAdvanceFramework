package org.example.basetest;

import org.example.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class CommonToAllTest {

    //to Call the Start the Webdriver
    //Down the Webdriver

    //who will start the webdriver?
    @BeforeMethod
    protected void setup() throws MalformedURLException {
        DriverManagerTL.init();

    }

    //who will close the webdriver?
    @AfterMethod
    protected void tearDown(){

        DriverManagerTL.down();
    }
}
