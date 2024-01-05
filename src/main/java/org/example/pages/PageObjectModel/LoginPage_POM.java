package org.example.pages.PageObjectModel;

import org.example.base.BasePage;
import org.example.driver.DriverManager;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends BasePage {

    public LoginPage_POM() {
        super();
    }

    //Page locators
    By username = By.id("Login-username");
    By password = By.id("Login-password");
    By signButton = By.id("js-login-btn");

    //Page Actions

    public LoginPage_POM LoginToVWOPositive() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);
        //DriverManager.getDriver().findElement(password).click(); --- rather this line we written in base class
        //Pass the control to the DashboardPage
        return this;
    }

    public void LoginToVWONegetive() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);
    }

    public DashboardPage_POM afterLogin(){
        return new DashboardPage_POM();
    }
}