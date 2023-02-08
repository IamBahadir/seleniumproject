package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class T1_Registration_Form {


    // 1 Open Browser
    // 2 Go to the website https://practice.cydeo.com/registration_form
    // 3 Enter First name
    // 4 Enter Last name
    // 5 Enter username
    // 6 Enter email address
    // 7 Enter password
    // 8 Enter phone number
    // 9 Select a gender from radio buttons
    // 10 Enter date of birth
    // 11 Select Department Office
    // 12 Select job title
    // 13 Select programming language from checkboxes
    // 14 Click to sign up button
    // 15 Verify success message 'You've successfully completed registration.'is displayed




    @Test
    public void registration_form_test() throws InterruptedException {



        //---------------------------------------------------------------------------------------------------------

        // 1 Open Browser
        // 2 Go to the website https://practice.cydeo.com/registration_form

        // Note :
        // Driver.getDriver() -->we use the getDriver() method under the Driver class from the utilities package
                                // for kind of the WebDriverManager steps
        // and then when we call the get() method , we need to pass the String that we are going to.
        // we can use the ConfigurationReader.getProperty() instead of passing the argument.
        // ConfigurationReader.getProperty() --> it provide the information that includes in the configuration.properties
        // the key : registration.form.url  value : https://practice.cydeo.com/registration_form

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //---------------------------------------------------------------------------------------------------------


        // 3 Enter First name

        WebElement firstNameBox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='first name']"));

        Faker faker = new Faker();

        String firstName = faker.name().firstName();

        firstNameBox.sendKeys(firstName);


        //---------------------------------------------------------------------------------------------------------

        // 4 Enter Last name

        WebElement lastNameBox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='last name']"));

        String lastName = faker.name().lastName();

        lastNameBox.sendKeys(lastName);

        //---------------------------------------------------------------------------------------------------------

        // 5 Enter username

        WebElement userNameBox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='username']"));

        String userName = faker.bothify("########??");

        userNameBox.sendKeys(userName);


        //---------------------------------------------------------------------------------------------------------

        // 6 Enter email address

        WebElement emailAddressBox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='email@email.com']"));

        String emailAddress = faker.internet().emailAddress();

        emailAddressBox.sendKeys(emailAddress);


        //---------------------------------------------------------------------------------------------------------

        // 7 Enter password

        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[5]"));

        String password = faker.internet().password();

        passwordBox.sendKeys(password);


        //---------------------------------------------------------------------------------------------------------

        // 8 Enter phone number

        WebElement phoneNumberBox = Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[6]"));

        String phoneNumber = faker.numerify("###-###-####");

        phoneNumberBox.sendKeys(phoneNumber);

        //---------------------------------------------------------------------------------------------------------

        // 9 Select a gender from radio buttons

        WebElement maleRadioButton = Driver.getDriver().findElement(By.xpath("(//div[@class='radio'])[1]/label/input"));

        WebElement femaleRadioButton = Driver.getDriver().findElement(By.xpath("(//div[@class='radio'])[2]/label/input"));

        WebElement otherRadioButton = Driver.getDriver().findElement(By.xpath("(//div[@class='radio'])[3]/label/input"));

        maleRadioButton.click();



        //---------------------------------------------------------------------------------------------------------

        // 10 Enter date of birth

        WebElement dateOfBirthBox = Driver.getDriver().findElement(By.xpath("(//div[@class='col-sm-5']/input)[7]"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        String birthOfDay = simpleDateFormat.format(faker.date().birthday());

        dateOfBirthBox.sendKeys(birthOfDay);

        //---------------------------------------------------------------------------------------------------------


        // 11 Select Department Office

        Select selectDepartmentOffice = new Select(Driver.getDriver().findElement(By.xpath("(//select[@class='form-control selectpicker'])[1]")));

        selectDepartmentOffice.selectByVisibleText("Department of Agriculture");

        Thread.sleep(1000);

        selectDepartmentOffice.selectByIndex(0);

        Thread.sleep(1000);

        selectDepartmentOffice.selectByValue("AO");


        //---------------------------------------------------------------------------------------------------------

        // 12 Select job title

        Select selectJobTitle = new Select(Driver.getDriver().findElement(By.xpath("(//select[@class='form-control selectpicker'])[2]")));

        selectJobTitle.selectByVisibleText("SDET");

        //---------------------------------------------------------------------------------------------------------

        // 13 Select programming language from checkboxes

        WebElement c = Driver.getDriver().findElement(By.xpath("(//div[@class='form-check form-check-inline'])[1]/input"));

        WebElement java = Driver.getDriver().findElement(By.xpath("(//div[@class='form-check form-check-inline'])[2]/input"));

        WebElement javaScript = Driver.getDriver().findElement(By.xpath("(//div[@class='form-check form-check-inline'])[3]/input"));

        java.click();


        //---------------------------------------------------------------------------------------------------------

        // 14 Click to sign up button

        WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));

        signUpButton.click();


        //---------------------------------------------------------------------------------------------------------

        // 15 Verify success message 'You've successfully completed registration.'is displayed

        WebElement registrationMessage = Driver.getDriver().findElement(By.xpath("//p"));

        String actualRegistrationMessage = registrationMessage.getText();

        String expectedRegistrationMessage = "You've successfully completed registration!";

        Assert.assertEquals(actualRegistrationMessage,expectedRegistrationMessage);



        //---------------------------------------------------------------------------------------------------------


    }

}// end line of the class



