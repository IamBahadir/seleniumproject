package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_staleElementReferenceException {
    public static void main(String[] args) throws InterruptedException {



        /*
        TC #6: StaleElementReferenceException
        1 Open a chrome browser
        2 Go to https://practice.cydeo.com/abtest
        3 Locate 'CYDEO' link, verify it is displayed
        4 Refresh the page
        5 Verify it is displayed, again.

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");

        WebElement cydeoLink = driver.findElement(By.cssSelector("a[target='_blank']"));

        if (cydeoLink.isDisplayed()) {
            System.out.println("Test verification is PASSED!");
        } else {
            System.out.println("Test verification is FAILED!!!");
        }

        Thread.sleep(1500);

        driver.navigate().refresh();

        // when you use the refresh you will immediately lose your connection.
        // We need to use RE-ASIGN if the test verification is PASSED!

        cydeoLink =driver.findElement(By.cssSelector("a[target='_blank']"));

        if (cydeoLink.isDisplayed()) {
            System.out.println("Test verification is PASSED!");
        } else {
            System.out.println("Test verification is FAILED!!!");
        }

        driver.quit();


    }
}
