package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_ZeroBank_Verification {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html ");

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = driver.findElement(By.className("page-header")).getText();


        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Test verification is PASSED!");
        }else {
            System.out.println("Test verification is FAILED! The actual header Text : "+actualHeaderText);
        }

        driver.quit();


    }

}
