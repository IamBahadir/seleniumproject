package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cydeo.com");
        String expected = "cydeo";
        String actual = driver.getTitle();

        if (actual.toLowerCase().equals(expected)){
            System.out.println("Tittle is equal, so it passed!");
        }else {
            System.out.println("Tittle is not equal, so it failed!!");
        }
        System.out.println("actual = " + actual);

        System.out.println("--------------------------------------");

        driver.navigate().to("http://practice.cydeo.com/");
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("Tittle contains 'cydeo', so it passed!");
        }else {
            System.out.println("Tittle does not contain 'cydeo', so it passed!");
        }
        System.out.println("actualURL = " + actualURL);

        driver.quit();

    }
}
