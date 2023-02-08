package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {


    @Test
    public void upload_test(){


        // Tc Upload Test

        // Go to https://practice.cydeo.com/upload

        String uploadFileUrl = ConfigurationReader.getProperty("upload.file.url");

        Driver.getDriver().get(uploadFileUrl);

        // Find some small file from your computer,
        // and get the path of it

        String uploadFilePath = "C:\\Users\\bahad\\OneDrive\\Masaüstü\\uploadFile.txt";

        // Upload file

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        chooseFile.sendKeys(uploadFilePath);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));

        uploadButton.click();

        WebElement uploadFileText = Driver.getDriver().findElement(By.xpath("//div[@id='uploaded-files']"));


        // Assert :

        String expectedFileText = "uploadFile.txt";


        Assert.assertEquals(uploadFileText.getText(),expectedFileText);

        // File uploaded text is displayed on the page





    }



}// end line of the class
