package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4_Cydeo_Verification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        Thread.sleep(1000);

        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        inputLink.click();

        Thread.sleep(1000);

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        String expectedTitleOfHomePageLink = "Practice";
        String actualTitleOfHomePageLink = driver.getTitle();

        if (actualTitleOfHomePageLink.equals(expectedTitleOfHomePageLink)){
            System.out.println("Test verification is PASSED! The actual result : " + actualTitleOfHomePageLink);
        } else {
            System.out.println("Test verification is FAILED! The actual result : " + actualTitleOfHomePageLink);
        }

        driver.quit();



    }
}
