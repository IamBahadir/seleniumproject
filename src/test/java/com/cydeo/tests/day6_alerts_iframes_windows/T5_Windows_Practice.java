package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test(){
        // Stroing the main page's handle as string is
        // good practice for future re-usable purposes

        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);

        // Assert : title is "Windows"

        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        // Click to : Click here link

        WebElement clickHereLink = driver.findElement(By.xpath("//a[@target='_blank']"));

        clickHereLink.click();

        // Switch to the New Window

        for (String each: driver.getWindowHandles()){

            driver.switchTo().window(each);

            System.out.println("Current title while switching windows :  " + driver.getTitle());

        }

        // Assert title is 'New Window'

        String expectedNewTitle = "New Window";

        Assert.assertEquals(driver.getTitle(),expectedNewTitle);

        // if we want to go back to main page
        // we can use already stored main handle

        driver.switchTo().window(mainHandle);


    }

    @AfterMethod
    public void tearDownMethod(){

        // driver.close(); close just last one
        driver.quit(); // close all the session

    }



}
