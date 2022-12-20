package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Google_Search {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");

        // 3 - Write "apple" in search box

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedInTitle = "apple";
        String actualInTitle = "apple - Google'da Ara";

        if (actualInTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification is PASSED!");
        }else {
            System.out.println("Title verification is FAILED!");
        }
        System.out.println("---------------------------------");



        driver.quit();







    }
}
