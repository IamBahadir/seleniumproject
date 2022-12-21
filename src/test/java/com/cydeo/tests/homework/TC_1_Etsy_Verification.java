package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1_Etsy_Verification {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        /*driver.navigate().to();*/

        /* These are the functionality that we shouldn't forget.

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        */


        // Find the element location then send a key
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        // This is expected result we're gonna match it.
        String expectedTitleOfPageWoodenSpoon = "Wooden spoon | Etsy";
        // This is actual result that we can get it by using getTitle()
        String actualTitleOfPageWoodenSpoon = driver.getTitle();
        System.out.println(actualTitleOfPageWoodenSpoon);


        if (actualTitleOfPageWoodenSpoon.equals(expectedTitleOfPageWoodenSpoon)){
            System.out.println("Title verification is PASSED!");
        }else {
            System.out.println("Title verification is FAILED! The actual title : "+actualTitleOfPageWoodenSpoon);
        }

        // There is also another helpful method : close();

        driver.quit();

    }
}
