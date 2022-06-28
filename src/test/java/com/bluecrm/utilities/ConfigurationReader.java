package com.bluecrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    //create a static bloc to be runned
    static{


        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("something happened in configuration class");
            e.printStackTrace();
        }




    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }
}
