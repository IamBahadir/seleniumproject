package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_QuillBotVerification {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.quillbot.com");

        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

        String tittle = driver.getTitle();
        System.out.println("tittle = " + tittle);
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        System.out.println("----------------------------------------------------");
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);








    }
}
