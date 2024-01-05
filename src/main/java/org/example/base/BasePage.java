package org.example.base;

import dev.failsafe.internal.util.Durations;
import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static dev.failsafe.internal.util.Durations.*;

public class BasePage {

    public BasePage(){
        //System.out.println("If you want to call something before every Page object class call, put your code here");
        // Open file , open Data Base connection you can write code here
    }

    // This page is common to All the pages


    public void implicitWait() {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickElement(By by) {
        DriverManager.getDriver().findElement(by).click();
    }

    public WebElement presenceOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    protected void enterInput(By by, String key) {
        DriverManager.getDriver().findElement(by).sendKeys(key);
    }

    protected WebElement getElement(By key) {
        return DriverManager.getDriver().findElement(key);
    }

    public void iWaitElementToBeVisible(WebElement loc,String url){
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfAllElements(loc));
            wait.until(ExpectedConditions.urlContains(url));
            } catch (Exception e) {
            System.out.println("Failed to Wait" + e.toString());
            }

        }


        //Driver call
        //Common Functions

    //Common Assertion code here

    }
