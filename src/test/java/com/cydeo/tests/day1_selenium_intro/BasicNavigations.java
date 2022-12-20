package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1 - Setup the browser driver

        WebDriverManager.chromedriver().setup();

        // 2 - Create instance of the driver

        WebDriver driver = new ChromeDriver();

        // Before we go the url its given, it makes the page maximize.

        driver.manage().window().maximize();

        // 3 - Go to the url its given

        driver.get("https://www.tesla.com");

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();

        Thread.sleep(3000);

        // use selenium to navigate refresh
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        // get the title of the page
        String title = driver.getTitle();
        System.out.println("title = " + title);

        // ge the current url by using Selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // This will cause it to close the current window.
        driver.close();

        // This will cause it to close all the windows it opened.
        driver.quit();






    }

}
