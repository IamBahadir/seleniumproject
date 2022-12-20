package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {
    public static void main(String[] args) {


        System.out.println("---------------------------------");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://practice.cydeo.com/");

        // to click to the element its provided.
        driver.findElement(By.linkText("A/B Testing")); // .click() or
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        // then you can get title of
        String actualTitle = driver.getTitle();

        String expectedTitle = "No A/B Test";


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }


        System.out.println("---------------------------------");

        // turn back to the home page
        driver.navigate().back();

        // then you can get title of homepage.

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

        System.out.println("---------------------------------");


        driver.quit();

    }
}
