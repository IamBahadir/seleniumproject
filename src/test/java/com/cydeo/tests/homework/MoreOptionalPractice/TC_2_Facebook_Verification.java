package com.cydeo.tests.homework.MoreOptionalPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_Facebook_Verification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com ");

        WebElement usernameBox = driver.findElement(By.id("email"));
        usernameBox.sendKeys("incorrect username");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("incorrect password");

        WebElement logInButton = driver.findElement(By.name("login"));
        logInButton.click();

        String expectedTitleOfPageAfterLoginFailed = "Facebook'a Giriş Yap";
        String actualTitleOfPageAfterLoginFailed = driver.getTitle();

        if (actualTitleOfPageAfterLoginFailed.equals(expectedTitleOfPageAfterLoginFailed)){
            System.out.println("Test verification is PASSED! The actual result : " + actualTitleOfPageAfterLoginFailed);
        } else {
            System.out.println("Test verification is FAILED! The actual result : " + actualTitleOfPageAfterLoginFailed);
        }

        System.out.println("-------------------------------------------------------");

        driver.quit();



    }
}

/*
TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
 */
