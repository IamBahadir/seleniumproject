package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {


    @Test
    public void javascript_executor_test1() throws InterruptedException {

        //Open a Chrome browser
        // Go to : https://practice.cydeo.com/infinite_scroll

        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        // Use below Javascript method and scroll

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        Thread.sleep(1000);

        for (int i = 0; i < 10; i++) {

            js.executeScript("window.scrollBy(0,750)");
            Thread.sleep(1000);
        }

        for (int i = 0; i < 10; i++) {

            js.executeScript("window.scrollBy(0,-750)");
            Thread.sleep(1000);

        }


        // 750 pixels down 10 times
        // 750 pixels up 10 times
        // JavaScript method to use : window.scrollBy(0,750)

    }


}// end line of the class
