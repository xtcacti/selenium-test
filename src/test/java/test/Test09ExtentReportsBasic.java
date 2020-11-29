package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test09ExtentReportsBasic {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        ExtentTest test = extent.createTest("Google Search");
        test.info("set up driver");
        driver.get("https://google.com");
        test.pass("Navigated to google.com");
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        test.pass("Enterd text in SearchBox");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test.pass("Pressed enter key");

        driver.close();
        test.pass("Enterd text in SearchBox");

        test.info("Test completed");

        extent.flush();
    }
}
