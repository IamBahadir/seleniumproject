package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    /*

    Go to https://practice.cydeo.com/web-tables
    Verify Bob's name is listed as expected
    expected: 'Bob Martin'
    Verify Bob Martin's order date is as expected
    Expected : '12/31/2021'

     */
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_test(){

        //Verify Bob's name is listed as expected
        WebElement nameBobMartin = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        //    expected: 'Bob Martin'
        String expectedName = "Bob Martin";

        Assert.assertEquals(nameBobMartin.getText(),expectedName);
        System.out.println("Name = " + nameBobMartin.getText());

        //    Verify Bob Martin's order date is as expected
        WebElement bobMartinOrderDate = driver.findElement(By.xpath("((//table[@class='SampleTable']/tbody/tr)[7]/td)[5]"));

        //     Expected : '12/31/2021'
        String expectedOrderDate = "12/31/2021";

        Assert.assertEquals(bobMartinOrderDate.getText(),expectedOrderDate);
        System.out.println("bobMartinOrderDate = " + bobMartinOrderDate.getText());


    }

    @Test
    public void test2(){


        // We use the returnOrderDate method from the WebTableUtils class under the utilities package

        System.out.println(WebTableUtils.returnOrderDate(driver,"nED STARK") );

    }

    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver,"Bob Martin","12/31/2021");


    }



}
