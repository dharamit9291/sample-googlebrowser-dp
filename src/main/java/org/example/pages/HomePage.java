package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By acceptCookies = By.id("L2AGLb");

    By searchField = By.className("gLFyf");

    public void clickOnAcceptCookiesLink(){
        Reporter.log("Clicking on login link " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }


    public void enterTextToSearchField(String text){

        sendTextToElement(searchField, text);
    }
}
