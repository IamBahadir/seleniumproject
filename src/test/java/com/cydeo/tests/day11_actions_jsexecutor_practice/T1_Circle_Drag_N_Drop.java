package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {


    @Test
    public void Test() throws InterruptedException {

        /*
        TC #: Drag and drop
        1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        2. Drag and drop the small circle to bigger circle.
        3. Assert:
        -Text in big circle changed to: “You did great!”
         */

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));

        acceptCookiesButton.click();

        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

       // ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true)",dragable);

        Thread.sleep(2000);

        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(smallCircle,bigCircle).perform();


        String expectedTitle = "You did great!";

        Assert.assertEquals(bigCircle.getText(),expectedTitle);

        Driver.closeDriver();


    }


    @Test
    public void test2(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));

        acceptCookiesButton.click();

        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle).click(bigCircle).perform();


        String expectedTitle = "You did great!";

        Assert.assertEquals(bigCircle.getText(),expectedTitle);

        Driver.closeDriver();



    }









}// end line of the class
