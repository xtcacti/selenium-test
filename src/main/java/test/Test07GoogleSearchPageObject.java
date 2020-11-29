package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class Test07GoogleSearchPageObject {
    private static WebDriver driver = null;
    public static void main(String[] args) {

    }

    public static void googleSearch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        GoogleSearchPageObjects searchPageObjects = new GoogleSearchPageObjects(driver);
        driver.get("https://google.com");
        searchPageObjects.setTextInSearchBox("A B C D");
        searchPageObjects.setTextInSearchBox(Keys.ENTER);

        driver.close();
    }
}
