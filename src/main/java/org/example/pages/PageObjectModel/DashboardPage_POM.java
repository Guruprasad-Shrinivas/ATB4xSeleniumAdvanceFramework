package org.example.pages.PageObjectModel;

import org.example.base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends BasePage {

    DashboardPage_POM(){

    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

  //Page Actions
    public String loggedUserName(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }

}
