package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_RegistirationFormVerification {


    public static void main(String[] args) {




        /*

        These are steps that we are going to utilize one by one.
        At first, I go to the "https://practice.cydeo.com".
        then to jump to the Registration form by using click()
        after I get the title of Reg. by using getTitle(),
        then comparing by using if else block
        if the valid credentials that will provide PASSED!,
        if it is not that will provide FAILED and the actual title.

        -----------------------------------------------------------

        to control if there is a difference between attribute's value,
        if the valid credentials that will provide PASSED!,
        if it is not that will provide FAILED and the actual attribute's value.

        At first, we use by findElement(By.className).getAttribute("placeholder")
        then we reach the inside of the first input.



         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        WebElement regForm = driver.findElement(By.linkText("Registration Form"));
        regForm.click();

        String expectedTitle = "Registration form";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title test verification is PASSED!");
        }else {
            System.out.println("Title test verification is FAILED! 'actualTitle is' : "+actualTitle);
        }

        System.out.println("--------------------------------------");

        String expectedAttributeValue = "first name";
        String actualAttributeValue = driver.findElement(By.className("form-control")).getAttribute("placeholder");

        if (actualAttributeValue.equals(expectedAttributeValue)){
            System.out.println("Attribute's value verification is PASSED!");
        }else {
            System.out.println("Attribute's value verification is FAILED! 'actualAttributeValue' is : "+actualAttributeValue);
        }

        driver.quit();


    }
}
