package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_Scroll_Practice {


    @Test
    public void scroll_practice_test() throws InterruptedException {

        /*
        TC #4: Scroll practice
        1- Open a Chrome browser
        2- Go to: https://practice.cydeo.com/
        3- Scroll down to “Powered by CYDEO”
        4- Scroll using Actions class “moveTo(element)” method


        TC #5: Scroll practice 2
        1- Continue from where the Task 4 is left in the same test.
        2- Scroll back up to “Home” link using PageUP button

         */


        Driver.getDriver().get("https://practice.cydeo.com");

        Thread.sleep(2000);

        WebElement powerByCydeo = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(powerByCydeo).perform();

        Thread.sleep(2000);

        System.out.println("---------------------------------");

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

/*
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-750)");
        }*/


        Driver.closeDriver();
    }


    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/");    }


}// end line of the class
