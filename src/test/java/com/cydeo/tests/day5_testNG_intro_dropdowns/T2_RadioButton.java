package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {

        /*
            TC : radioButton handling
            Open chrome browser
            Go to https://practice.cydeo.com/radio_buttons
            Click to Hockey radio button
            Verify Hockey radio button is selected after clicking.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        Thread.sleep(1500);

        // Click to Hockey radio button

        WebElement hockeyElement = driver.findElement(By.xpath("//input[@id='hockey']"));

        hockeyElement.click();

        // Verify Hockey radio button is selected after clicking.

        if (hockeyElement.isSelected()){
            System.out.println("hockeyElement isSelected test verification is PASSED!");
        }else {
            System.out.println("hockeyElement isSelected test verification is FAILED!!!");
        }

    }
}
