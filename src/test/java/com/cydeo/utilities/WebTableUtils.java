package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    /*
    Method info
    Name returnOrderDate
    Return type : String
    Arg1 : WebDriver driver
    Arg2 : String costumerName
    This method should accept a costumerName and return the costumer order date as a String

     */
    public static String returnOrderDate(WebDriver driver, String customerName) {

        String name = customerName;
        String firstName = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase();
        String lastName = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase() + name.substring(name.indexOf(" ") + 2).toLowerCase();
        name = firstName + " " + lastName;


        String locator = "//td[.='" + name + "']/following-sibling::td[3]";


        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return customerDateCell.getText();


    }

    /*
    Method info
    name: orderVerify()
    Return type void
    Arg1 : WebDriver driver
    Arg2 : String customerName
    Arg3 : String expectedOrderDate
    This method should accept above-mentioned arguments and internally assert
    expectedOrderDate matching actualOrderDate
     */

    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){


        String actualOrderDate = returnOrderDate(driver, customerName);
        Assert.assertEquals(actualOrderDate,expectedOrderDate);


    }



}
