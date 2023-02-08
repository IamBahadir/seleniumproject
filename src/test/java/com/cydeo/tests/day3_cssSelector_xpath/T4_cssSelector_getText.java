package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {


        /*
        Open a chrome browser
        Go to : https://login1.nextbasecrm.com/?forgot_password=yes
        Verify 'Reset password' button text is as expected
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        String expectedResetPasswordButtonText = "Reset password";

        WebElement resetPassword = driver.findElement(By.cssSelector("button[value='Reset password']"));


        String actualResetPasswordButtonText = resetPassword.getText(); // akjshdkjahdkjas

        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Reset Password test verification is PASSED!");
        }else {
            System.out.println("actualResetPasswordButtonText = " + actualResetPasswordButtonText);
            System.out.println("Reset password test verification is FAILED!!!");
        }


    }
}
