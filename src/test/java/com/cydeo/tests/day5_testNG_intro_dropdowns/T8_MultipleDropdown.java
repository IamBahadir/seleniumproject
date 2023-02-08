package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8_MultipleDropdown {

    /*
    TC #8: Selecting value from multiple select dropdown
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        System.out.println("Before method is running..");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void multipleDropdown() throws InterruptedException {

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        simpleDropdown.selectByVisibleText("Option 1");

        Select dateYear = new Select(driver.findElement(By.id("year")));
        dateYear.selectByVisibleText("2023");

        Select dateMonth = new Select(driver.findElement(By.id("month")));
        dateMonth.selectByIndex(4);

        Select dateDay = new Select(driver.findElement(By.id("day")));
        dateDay.selectByValue("7");

        Select stateSelection = new Select(driver.findElement(By.id("state")));
        stateSelection.selectByValue("FL");

        Select programmingLanguages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        programmingLanguages.selectByIndex(0);

        Thread.sleep(1000);
        driver.navigate().refresh();


    }

}// end line of the class
