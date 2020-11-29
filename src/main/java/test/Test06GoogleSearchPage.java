package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class Test06GoogleSearchPage {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://google.com");
        GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
        GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ENTER);

        driver.close();
        System.out.println("Test completed!");
    }
}