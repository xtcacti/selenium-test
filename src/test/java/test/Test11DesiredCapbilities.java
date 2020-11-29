package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test11DesiredCapbilities {
    public static void main(String[] args) {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("ignoreProtectedModeSettings",true);

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(cap);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        driver.close();
        driver.quit();
    }
}
