package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTittleVerification {

    public static void main(String[] args) throws InterruptedException {


        // At first we need to setup WebDriverManager
        WebDriverManager.chromedriver().setup();
        // we should open the browser
        WebDriver driver = new ChromeDriver();
        // for reaching to the page , we need to get the page Url
        driver.get("https://www.yahoo.com");
        // to maximize the page it opened because of possibility of responsive page
        driver.manage().window().maximize();

        Thread.sleep(2000);
        // These attributes give an advantage of opportunity for move back, forward or refresh.
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

        // to get the tittle and Url
        String tittle = driver.getTitle();
        System.out.println("tittle = " + tittle);
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // driver.close();
        driver.quit();




    }
}
