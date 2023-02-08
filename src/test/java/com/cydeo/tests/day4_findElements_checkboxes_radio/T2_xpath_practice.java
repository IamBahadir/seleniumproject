package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_xpath_practice {
    public static void main(String[] args) {

        /*
        TC #6:  XPATH LOCATOR practice
        1. Open Chrome browser
        2. Go to http://practice.cydeo.com/multiple_buttons
        3. Click on Button 1
        4. Verify text displayed is as expected:
        Expected: “Clicked on button one!”

         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cydeo.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        String expectedButton1ResultText = "Clicked on button one!";
        WebElement button1Result = driver.findElement(By.cssSelector("p[id='result']"));
        String button1ResultText =  button1Result.getText();

        if (expectedButton1ResultText.equals(button1ResultText)){
            System.out.println("Test verification is PASSED!");
        }else {
            System.out.println("Test verification is FAILED!!!");
        }

        driver.quit();


    }
}
