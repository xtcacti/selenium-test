package config;

import test.Test02Module;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    static Properties prop = new Properties();

    public static void readPorpertiesFile() {
        try {
            InputStream input = new FileInputStream("C:/Workspace/learn-selenium/selenium-test/src/main/java/config/config.properties");
            prop.load(input);
            Test02Module.browser = prop.getProperty("browser");
            System.out.println(Test02Module.browser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeProperties() {
        try {
            OutputStream output = new FileOutputStream("C:/Workspace/learn-selenium/selenium-test/src/main/java/config/config.properties");
            prop.setProperty("browser","Chrome");
            prop.store(output,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
