package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropdownTest(){

        // we create a object which id's name is dropdown
        Select simpleDropdown = new Select( driver.findElement( By.xpath("//select[@id='dropdown']") ) );
        // store the selected option to the WebElement
        WebElement currentSelectedOption = simpleDropdown.getFirstSelectedOption();
        // get the text
        String actualSimpleDropdownText = currentSelectedOption.getText();
        //assert
        String expectedSimpleDropdownText = "Please select an option";
        Assert.assertTrue(actualSimpleDropdownText.equals(expectedSimpleDropdownText));

    }

    @Test
    public void stateDropdownTest(){

        //we create an object which id's name is state
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")) );
        // store the selected option to the WebElement
        WebElement currentStateSelectedOption = stateDropdown.getFirstSelectedOption();
        // get the text
        String actualStateSelectedOption = currentStateSelectedOption.getText();
        //assert
        String expectedStateSelectedOption = "Select a State";
        Assert.assertEquals(actualStateSelectedOption,expectedStateSelectedOption);

    }


} // end line of the class
