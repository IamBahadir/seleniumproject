package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_WebsiteDropdowns {

    /*
    TC #7: Selecting value from non-select dropdown
    1. Open Chrome browser
    2. Go to https://practice.cydeo.com/dropdown
    3. Click to non-select dropdown
    4. Select Facebook from dropdown // This is not a specific dropdown menu, it exists a div that includes five 'a' tags.
    5. Verify title is “Facebook - Log In or Sign Up”
     */
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void websiteDropdownTest() {

        // in this example, The <a> tags inside the <div> element define the available options in the drop-down list.

        WebElement nonSelect = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelect.click();

        WebElement websiteDropdownOptionsFacebook = driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[4]"));
        websiteDropdownOptionsFacebook.click();


        String expectedTitle = "Facebook - Giriş Yap veya Kaydol";
        Assert.assertEquals(driver.getTitle(),expectedTitle);

    }


}
