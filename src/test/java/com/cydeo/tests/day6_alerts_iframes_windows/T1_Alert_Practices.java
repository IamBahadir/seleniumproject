package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com//javascript_alerts");

    }

    @Test
    public void alert_test1(){
        WebElement clickForJsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        clickForJsAlert.click();

        // to be able to click to alert OK button we need to switch driver's focus to Alert itself

        Alert alert = driver.switchTo().alert();

        // click to OK button from the alert

        alert.accept();

        // Verify 'You successfully clicked an alert' text is displayed

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String actualResultText =  resultText.getText();
        String expectedResultText = "You successfully clicked an alert";

        Assert.assertEquals(actualResultText,expectedResultText);

    }


}
