package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com");


        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedLoginButton = "Log In";
        String actualLoginButton = loginButton.getAttribute("value");

        if (actualLoginButton.equals(expectedLoginButton)){
            System.out.println("actualLoginButton = " + actualLoginButton);
            System.out.println("Login Button text Verification is PASSED!");
        }else {
            System.out.println("actualLoginButton = " + actualLoginButton);
            System.out.println("Login Button text Verification is FAILED!!");
        }

        driver.close();

    }

}
