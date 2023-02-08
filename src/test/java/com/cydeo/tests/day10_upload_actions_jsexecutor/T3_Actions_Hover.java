package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {


    @Test
    public void hovering_test(){

        // Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        Actions actions = new Actions(Driver.getDriver());



        // Hover over to first image
        // Assert :
        // "name: user1" is displayed
        // "view profile" is displayed
        WebElement firstImg = Driver.getDriver().findElement(By.xpath("(//div[@class='figure']/img)[1]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement viewProfile1 =Driver.getDriver().findElement(By.xpath("//a[@href='/users/1']"));


        actions.moveToElement(firstImg).perform();

        Assert.assertTrue(user1.isDisplayed());
        Assert.assertTrue(viewProfile1.isDisplayed());

        // Hover over to second image
        // Assert :
        // "name: user2" is displayed
        // "view profile" is displayed

        WebElement secondImg = Driver.getDriver().findElement(By.xpath("(//div[@class='figure']/img)[2]"));

        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement viewProfile2 =Driver.getDriver().findElement(By.xpath("//a[@href='/users/2']"));

        actions.moveToElement(secondImg).perform();

        Assert.assertTrue(user2.isDisplayed());
        Assert.assertTrue(viewProfile2.isDisplayed());




        // Hover over to third image
        // Assert :
        // "name: user3" is displayed
        // "view profile" is displayed

        WebElement thirdImg = Driver.getDriver().findElement(By.xpath("(//div[@class='figure']/img)[3]"));

        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        WebElement viewProfile3 =Driver.getDriver().findElement(By.xpath("//a[@href='/users/3']"));

        actions.moveToElement(thirdImg).perform();

        Assert.assertTrue(user3.isDisplayed());
        Assert.assertTrue(viewProfile3.isDisplayed());


    }


}// end line of the class
