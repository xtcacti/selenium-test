package test;

import config.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * 2020/11/19
 * sample to module code
 * */
public class Test02Module {
    public static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {
        PropertiesFile.readPorpertiesFile();
        setBrowserConfig(browser);
        runTest();
    }

    public static void setBrowserConfig(String name) {
        if (name.contains("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/Software/Webdriver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (name.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Software/Webdriver/chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public static void runTest() {
        driver.get("https://selenium.dev/");
        driver.quit();
    }
}
