package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class LoginPage extends Utility {





    //forgotten password
    By forgotPasswordLink = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By forgotPasswordMessage = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");


    By welcomeText = By.id("welcome");
    By usernameField = By.id("txtUsername");
    By passwordField = By.name("txtPassword");
    By loginButton =By.id("btnLogin");

    By loginpanelText=By.xpath("//div[@id='logInPanelHeading']");





    public void forgottenPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }

    public String forgottenPasswordMessage() {
        return getTextFromElement(forgotPasswordMessage);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickLoginButton() {
        clickOnElement(loginButton);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }


    
    public void verifyExpectedAndActual(By by, String expectedText) {
        String actualText = getTextFromElement(by);
            }



    public String logInPanelText() {
        return getTextFromElement(loginpanelText);
    }







}
