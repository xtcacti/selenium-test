package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test05GoogleSearch {
    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//        driver.findElement(By.name("btnK")).click();

        driver.close();
        System.out.println("Test completed!");
    }
}
