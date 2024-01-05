package org.example.basetest;

import org.example.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class basetest {

    //to Call the Start the Webdriver
    //Down the Webdriver

    @BeforeMethod
    protected void setup() throws MalformedURLException {
        DriverManager.init();

    }
    @AfterMethod
    protected void tearDown(){
        DriverManager.down();
    }
}
