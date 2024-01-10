package org.example.vwo.LoginTests;

import org.assertj.core.api.Assertions;
import org.example.basetest.CommonToAllTest;
import org.example.pages.PageObjectModel.DashboardPage_POM;
import org.example.pages.PageObjectModel.LoginPage_POM;
import org.example.utils.PropertyReader;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class LoginTest extends CommonToAllTest {

    @Test
    public void testLoginPositive() throws Exception {

    //how to enter the user, pass and go to the Dashboard and verify
    LoginPage_POM pagePom = new LoginPage_POM();
    pagePom.openURL(PropertyReader.readKey("url"));
    DashboardPage_POM dashboardPagePom = pagePom.LoginToVWOPositive().afterLogin();
    String expected_username = dashboardPagePom.loggedUserName();
        Assertions.assertThat(expected_username)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("expected_username"));

    }

    }

