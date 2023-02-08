package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println("numerify : "+faker.numerify("####-####-####-####"));
        System.out.println("numerify : "+faker.numerify("1###-#2##-##3#-###4"));

        System.out.println("----------------------------------");

        System.out.println("letterify : "+faker.letterify("???-??????"));

        System.out.println("----------------------------------");

        System.out.println("botifhy : "+faker.bothify("###??##"));

        System.out.println("----------------------------------");

        System.out.println("IBAN : "+faker.finance().iban("TR"));

        System.out.println("----------------------------------");

        System.out.println("Pokemon : "+faker.pokemon().name());

        System.out.println("----------------------------------");

        System.out.println("Shakespeare : "+faker.shakespeare().hamletQuote());


    }

}
