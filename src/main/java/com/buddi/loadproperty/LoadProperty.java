package com.buddi.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;
    String path = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream((path + "\\src\\test\\java\\resources\\properties\\config.properties"));
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
