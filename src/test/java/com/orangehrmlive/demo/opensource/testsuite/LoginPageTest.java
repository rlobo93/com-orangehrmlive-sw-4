package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.pages.LoginPage;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();

@Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

    //forgotten password
        loginPage.forgottenPasswordLink();

       // Verify the text ‘Forgot Your Password?’
        String expectedMessage = "Forgot Your Password?";
        String actualMessage= loginPage.forgottenPasswordMessage();
            Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
        }

   @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        //locate username field and enter valid username
       loginPage.enterUsername("Admin");

        //locate password field and enter valid password
       loginPage.enterPasswordField("admin123");

        //locate login button and click it
       loginPage.clickLoginButton();

        //Verify the ‘Welcome’ text is display






    }




    }
