package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class is Running! ");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("After class is Running!");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("----> Before METHOD is running! ");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> After METHOD is running! ");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running...");

        // Assert equals : compare 2 of the same things

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running...");

        // Assert equals : compare 2 of the same things

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));

    }

}
