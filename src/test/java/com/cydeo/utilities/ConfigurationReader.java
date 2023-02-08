package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {


        try {

            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();

        } catch (IOException e) {
            System.out.println("Something happened in the Configuration Reader Class");
        }

    }// end line of the Static Block


    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }




}// end line of the Class
