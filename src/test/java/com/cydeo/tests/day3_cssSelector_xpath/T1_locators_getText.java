package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) throws InterruptedException {


        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("edge");

        driver.get("https://login1.nextbasecrm.com");
        driver.manage().window().maximize();


        Thread.sleep(1000);
        WebElement loginInput = driver.findElement(By.name("USER_LOGIN"));
        loginInput.sendKeys("incorrectUsername");

        Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrectPassword");

        Thread.sleep(1000);
        WebElement LoginButton = driver.findElement(By.className("login-btn"));
        LoginButton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String actualResult = errorMessage.getText();

        System.out.println("actualResult = " + actualResult);

        String expectedResult = "Incorrect login or password";

        if (actualResult.equals(expectedResult)){
            System.out.println("Verification is PASSED!");
        }else {
            System.out.println("Verification is FAILED!"+" actual result is : "+actualResult);
        }

        driver.close();

    }

}
