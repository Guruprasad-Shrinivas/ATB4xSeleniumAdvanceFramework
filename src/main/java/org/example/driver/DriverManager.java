package org.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.desktop.QuitEvent;
import java.net.MalformedURLException;
import java.sql.Driver;
import java.util.Objects;

import static org.example.driver.DriverManagerTL.setDriver;

public class DriverManager {

  //Static method - Shared by all the test cases.
  //Thread local - 1 Class or Test per Driver

    static WebDriver driver;

    //@BeforeMethod
    public static void init(){
        if(driver==null){
            driver = new EdgeDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    //@AfterMethod
    public static void down(){
        if(driver != null){
            driver.quit();
            driver=null;
        }
    }

}
