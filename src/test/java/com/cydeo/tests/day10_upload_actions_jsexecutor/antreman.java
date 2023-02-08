package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

public class antreman {
    public static void main(String[] args) {
/*

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Faker faker = new Faker();
        String dob = sdf.format(faker.date().birthday());
        System.out.println(dob);
*/


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/DD/YYYY");

        Faker faker = new Faker();

        String birthOfDay = simpleDateFormat.format(faker.date().birthday());

        System.out.println("birthOfDay = " + birthOfDay);


    }
}
