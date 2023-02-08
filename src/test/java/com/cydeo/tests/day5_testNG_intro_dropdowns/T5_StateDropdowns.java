package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_StateDropdowns {

    /*
    TC #5: Selecting state from State dropdown and verifying result
    1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/dropdown
    3. Select Illinois
    4. Select Virginia
    5. Select California
    6. Verify final selected option is California.
    Use all Select options. (visible text, value, index)
     */

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void stateDropdown(){
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")) );
        stateDropdown.selectByIndex(14);
        stateDropdown.selectByVisibleText("Virginia");
        stateDropdown.selectByValue("CA");

        // get the text and verify 'California'

        String expectedStateText = "California";

        String actualStateText = stateDropdown.getFirstSelectedOption().getText();

        //Assert

        Assert.assertEquals(actualStateText,expectedStateText);




    }


}
