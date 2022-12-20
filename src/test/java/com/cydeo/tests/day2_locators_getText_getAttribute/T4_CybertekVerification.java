package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_CybertekVerification {

    public static void main(String[] args) throws InterruptedException {



        /*

        These are steps that we are going to utilize one by one.
        At first, we go the "https://library2.cybertekschool.com/login.html" by using get().
        then we need to write down userName and password by using className , id
        and we need to click the sign button by using click()
        in the end, we make sure the warning message is "Sorry, Wrong Email or Password"

         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");


        WebElement userName = driver.findElement(By.className("form-control"));
        userName.sendKeys("incorrect@email.com");


        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        WebElement signIn = driver.findElement(By.tagName("button"));
        signIn.click();

        String expectedWarningMessage   = "Sorry, Wrong Email or Password";
        String actualWarningMessage     = "Sorry, Wrong Email or Password";



        if (actualWarningMessage.equals(expectedWarningMessage)){
            System.out.println("Test verification is PASSED!");
        }else {
            System.out.println("Test verification is FAILED.");
        }

        driver.quit();






    }
}