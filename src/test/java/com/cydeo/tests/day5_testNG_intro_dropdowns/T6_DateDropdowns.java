package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_DateDropdowns {

    /*
    TC #6: Selecting date on dropdown and verifying
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Select “December 1st, 1923” and verify it is selected. // there is no option which is 1923
    Select year using  : visible text
    Select month using   : value attribute
    Select day using : index number
     */

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
        System.out.println("Setup Method is running..");
    }

    @Test
    public void dateDropdownTest(){
        Select selectYear = new Select( driver.findElement(By.xpath("//select[@id='year']")) );
        selectYear.selectByVisibleText("1924");

        Select selectMonth = new Select( driver.findElement(By.xpath("//select[@id='month']")) );
        selectMonth.selectByValue("11");

        Select selectDay = new Select( driver.findElement(By.xpath("//select[@id='day']")) );
        selectDay.selectByIndex(0);


    }



}
