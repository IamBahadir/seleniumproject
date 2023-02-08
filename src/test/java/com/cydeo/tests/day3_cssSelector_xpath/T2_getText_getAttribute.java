package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {



        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com");
        driver.manage().window().maximize();

        // Verify "remember me" label text is as expected:
        // Expected : Remember me on this computer

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String actualRememberMeLabel = rememberMeLabel.getText();

        String expectedRememberMeLabel = "Remember me on this computer";

        if (expectedRememberMeLabel.equals(actualRememberMeLabel)) {
            System.out.println("Remember me label Verification is PASSED!");
        } else {
            System.out.println("Remember me label Verification is FAILED!");
        }

        // Verify "forgot password" Link text is as expected:
        // Expected : Forgot your password?

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualforgotPasswordLinkText = forgotPasswordLink.getText();
        String expectedUserPasswordLinkText = "Forgot your password?";


        if (actualforgotPasswordLinkText.equals(expectedUserPasswordLinkText)){
            System.out.println("User password Text Verification is PASSED!");
        }else {
            System.out.println("User password text Verification is FAILED!");
        }

        // Verify "forgot password" href attribute's value contains as expected:
        // Expected : forgot_password=yes

        WebElement forgotYourPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotYourPasswordHrefText = forgotYourPassword.getAttribute("href");

        String expectedforgotYourPasswordHrefText = "forgot_password=yes";

        if (actualForgotYourPasswordHrefText.contains(expectedforgotYourPasswordHrefText)){
            System.out.println("Forgot your password href text Verification is PASSED!");
        }else {
            System.out.println("Forgot your password href text Verification is FAILED!");
        }

        driver.close();

    }
}
