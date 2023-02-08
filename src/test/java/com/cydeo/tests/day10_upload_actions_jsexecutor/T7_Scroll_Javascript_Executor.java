package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_Javascript_Executor {



    @Test
    public void javascript_Executor() throws InterruptedException {

        /*
        TC #7: Scroll using JavascriptExecutor
        1- Open a Chrome browser
        2- Go to: https://practice.cydeo.com/large
        3- Scroll down to “Cydeo” link
        4- Scroll up to “Home” link
        5- Use below provided JS method only

        JavaScript method to use : arguments[0].scrollIntoView(true)

        Note: You need to locate the links as web elements and pass them as
        arguments into executeScript() method


         */


        //        1- Open a Chrome browser
        //        2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        Thread.sleep(1500);

        //        3- Scroll down to “Cydeo” link
        WebElement powerByCydeoLink = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",powerByCydeoLink);


        //         4- Scroll up to “Home” link
        Thread.sleep(1500);

        WebElement navBar = Driver.getDriver().findElement(By.xpath("//nav[@class='navbar navbar-expand-sm bg-light']"));

        js.executeScript("arguments[0].scrollIntoView(true)",navBar);

    }



}
