package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) throws InterruptedException {


        /*
        TC StaleElementsReferenceException handling
        Open Chrome browser
        Go to https://practice.cydeo.com/add_remove_elements/
        Click to Add Element button
        Verify "Delete" button is displayed after clicking.
        Click to Delete button
        Verify Delete button is NOT displayed after clicking.
        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS.
         */


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        // Click to Add Element button
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(1500);

        addElement.click();

        //Verify "Delete" button is displayed after clicking.
        WebElement deleteElement = driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteElement.isDisplayed()){
            System.out.println("deleteElement Test verification is PASSED!");
        }else {
            System.out.println("deleteElement Test verification is FAILED!!!");
        }

        //Click to Delete button
        Thread.sleep(1500);
        deleteElement.click();


        // Verify Delete button is NOT displayed after clicking.

        try {
            if (deleteElement.isDisplayed()){
                System.out.println("deleteElement Test verification is PASSED!");
            }else {
                System.out.println("deleteElement Test verification is FAILED!!!");
            }
        }catch (StaleElementReferenceException e){
            System.out.println("Stale Element exception is thrown");

            System.out.println("deleteElement Test verification is PASSED!");
        }

        driver.quit();




    }
}
