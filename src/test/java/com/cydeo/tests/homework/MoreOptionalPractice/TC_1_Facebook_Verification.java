package com.cydeo.tests.homework.MoreOptionalPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_Facebook_Verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com ");

        String expectedTitleOfHomePage = "Facebook - Log In or Sign Up";
        String actualTitleOfHomePage = driver.getTitle();

        if (actualTitleOfHomePage.equals(expectedTitleOfHomePage)){
            System.out.println("Test verification is PASSED! The actual result : " + actualTitleOfHomePage);
        } else {
            System.out.println("Test verification is FAILED! The actual result : " + actualTitleOfHomePage);
        }

        System.out.println("-------------------------------------------------------");





    }
}
