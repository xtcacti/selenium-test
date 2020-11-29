package test;

import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Test25SeleniumWaits {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("abcd");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement abcd = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
//        abcd.click();


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement abcd = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.partialLinkText("abcd"));
            }
        });
        abcd.click();

        driver.close();
        System.out.println("Test completed!");
    }
}
