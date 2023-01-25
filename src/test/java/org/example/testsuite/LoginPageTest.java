package org.example.testsuite;


import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void usershouldTypeTescoOnBrowser(){
        homePage.clickOnAcceptCookiesLink();
        homePage.enterTextToSearchField("tesco");

    }


}
