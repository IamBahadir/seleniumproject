package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_test(){

        // we need to switch focus to iframe at first before we locate the web element
        driver.switchTo().frame(0);
        //locate the paragraph tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        // if you're looking something parent of the html, you need to change driver's focus by using parentFrame()
        driver.switchTo().parentFrame();

        WebElement title = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(title.isDisplayed());

        // ---------- I am on the parent of the HTML ---------- //






    }

}
