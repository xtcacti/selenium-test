package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
* 2020/11/19
* sample to start selenium bu chrome or firefox
* */
public class Test01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Software/Webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/");
        driver.quit();

//        System.setProperty("webdriver.gecko.driver", "C:/Software/Webdriver/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://translate.google.cn");
//        driver.quit();
    }
}
