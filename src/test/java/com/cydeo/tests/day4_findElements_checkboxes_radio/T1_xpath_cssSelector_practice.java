package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        // Locate all the WebElements on the page using XPATH and/or CSS

        // a. "Home" link

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        /* cssSelector
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']")); */

        // b. "Forgot password header"

        WebElement forgotPassword = driver.findElement(By.xpath("//div//div[@class='example']//h2"));
        String forgotPasswordHeader = forgotPassword.getText();

        /* cssSelector
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div[class='example'] h2"));
        String forgotPasswordHeader2 = forgotPassword2.getText(); */

        // c. "E-mail" text

        WebElement emailHeader = driver.findElement(By.xpath("//div//label[@for='email']"));
        String emailHeaderText = emailHeader.getText();

        /* cssSelector
        WebElement emailHeader2 = driver.findElement(By.cssSelector("label[for='email']"));
        String emailHeaderText2 = emailHeader2.getText(); */

        // d. Email input box

        WebElement emailInputBox = driver.findElement(By.xpath("//div//input[@type='text']"));

        /* cssSelector
        WebElement emailInputBox2 = driver.findElement(By.cssSelector("div input[name='email']")); */

        // e. 'Retrieve password' button

        WebElement retrieveButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        /* cssSelector
        WebElement retrieveButton2 = driver.findElement(By.cssSelector("button#form_submit.radius"));
         */

        // f. Powered by Cydeo text

        WebElement powerByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        String powerByCydeoText = powerByCydeo.getText();

        /* cssSelector
        WebElement powerByCydeo2 = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        String powerByCydeoText2 = powerByCydeo2.getText();

         */

        System.out.println("homeLink = " + homeLink.isDisplayed());
        System.out.println("forgotPassword = " + forgotPassword.isDisplayed());
        System.out.println("emailHeader = " + emailHeader.isDisplayed());
        System.out.println("emailInputBox = " + emailInputBox.isDisplayed());
        System.out.println("retrieveButton = " + retrieveButton.isDisplayed());
        System.out.println("powerByCydeo = " + powerByCydeo.isDisplayed());

        driver.quit();





    }
}
