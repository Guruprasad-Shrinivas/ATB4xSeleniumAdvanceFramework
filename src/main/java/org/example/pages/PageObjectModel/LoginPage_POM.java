package org.example.pages.PageObjectModel;

import org.example.base.CommonToAllPage;
import org.example.driver.DriverManagerTL;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends CommonToAllPage {

    public LoginPage_POM() {

        super();
    }

    //Page locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By error_message = By.id("js-notification-box-msg");

    //Page Actions

    public LoginPage_POM LoginToVWOPositive() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(signButton);
        //DriverManager.getDriver().findElement(password).click(); --- rather this line we written in base class
        //Pass the control to the DashboardPage
        return this;
    }
    public void openURL(String url){
        DriverManagerTL.getDriver().get(url);
        //return this;
    }

    public String LoginToVWONegetive() throws Exception {
        enterInput(username, "admin");
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);
        //Error String
        visibilityOfElement(error_message);
        return getElement(error_message).getText();
    }

    public DashboardPage_POM afterLogin(){

        return new DashboardPage_POM();
    }
}