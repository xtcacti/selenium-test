package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04SeleniumWebDriverManager {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().driverVersion("2.36").setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/");
        driver.quit();
    }
}
