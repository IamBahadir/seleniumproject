package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {


        /*
        TC #4: FindElements TASK
        1- Open a chrome browser
        2- Go to : https://practice.cydeo.com/abtest
        3- Locate all the links in the page
        4- Print out the number of the links on the page
        5- Print out the texts of the links
        6- Print out the Href attribute values of the links

        */


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com/abtest");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 3- Locate all the links in the page

        List<WebElement> allLink = driver.findElements(By.tagName("a"));

        System.out.println(allLink);


        /* By using 'findElement'
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

         */



        // 4- Print out the number of the links on the page

        System.out.println("allLink.size() = " + allLink.size());


        /* By using 'findElement'
        int count = 0;

        while (true) {
            if (homeLink.isDisplayed()) {
                count++;
            }
            if (cydeoLink.isDisplayed()) {
                count++;
            }
            break;
        }
        System.out.println(count);

         */

        // 5- Print out the texts of the links

        for (WebElement each : allLink) {
            System.out.println("each = " + each.getText());
        }



        /* By using 'findElement'
        String homeLinkText = homeLink.getText();
        System.out.println("homeLinkText = " + homeLinkText);

        String cydeoLinkText = cydeoLink.getText();
        System.out.println("cydeoLinkText = " + cydeoLinkText);

         */

        // 6- Print out the Href attribute values of the links

        for (WebElement each : allLink) {
            System.out.println("each = " + each.getAttribute("href"));
        }

        /* By using 'findElement'
        String homeLinkHrefAttribute = homeLink.getAttribute("href");
        System.out.println("homeLinkHrefAttribute = " + homeLinkHrefAttribute);

        String cydeoLinkHrefAttribute = cydeoLink.getAttribute("href");
        System.out.println("cydeoLinkHrefAttribute = " + cydeoLinkHrefAttribute);

        // quit

         */

        driver.quit();


    }
}
