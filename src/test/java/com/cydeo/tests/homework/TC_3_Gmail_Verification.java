package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_3_Gmail_Verification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");

        WebElement linkGmail = driver.findElement(By.linkText("Gmail"));
        linkGmail.click();

        String expectedTitleOfGmailPageLink = "Gmail";
        String actualTitleOfGmailPageLink = driver.getTitle();

        // The first step to check by using contains()

        if (actualTitleOfGmailPageLink.contains(expectedTitleOfGmailPageLink)) {
            System.out.println("Test verification is PASSED! The actual result : " + actualTitleOfGmailPageLink);
        } else {
            System.out.println("Test verification is FAILED! The actual result : " + actualTitleOfGmailPageLink);
        }

        System.out.println("-------------------------------------------");


        driver.navigate().back();

        String expectedTitleOfGooglePage = "Google";
        String actualTitleOfGooglePage = driver.getTitle();

        if (actualTitleOfGooglePage.equals(expectedTitleOfGooglePage)) {
            System.out.println("Test verification is PASSED! The actual result : " + actualTitleOfGooglePage);
        } else {
            System.out.println("Test verification is FAILED! The actual result : " + actualTitleOfGooglePage);
        }

        System.out.println("-------------------------------------------");

        driver.quit();


    }

}
