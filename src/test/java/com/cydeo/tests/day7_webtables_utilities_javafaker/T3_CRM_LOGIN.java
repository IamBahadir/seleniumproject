package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {

    /*
    Login scenario
    Create new test and make set up
    Go to https://login1.nextbasecrm.com/
    Enter valid username
    Enter valid password
    Click to Log in button
    Verify title is as expected
    Expected : Portal

    username : helpdesk1@cybertekschool.com password : UserUser
    username : helpdesk1@cybertekschool.com password : UserUser


     */


    @Test
    public void crm_Login_test(){
        driver.get("https://login1.nextbasecrm.com/");

        // enter a valid name

        WebElement usernameInput = driver.findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        usernameInput.sendKeys("helpdesk1@cybertekschool.com");

        // enter a valid password

        WebElement passwordInput = driver.findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        passwordInput.sendKeys("UserUser");

        //    Click to Log in button

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        // Verify title is expected // 'Portal'

        BrowserUtils.verifyTitle(driver,"(3) My tasks");

    }






}// end line of the class
