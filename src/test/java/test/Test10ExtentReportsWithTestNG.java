package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test10ExtentReportsWithTestNG {

    WebDriver driver = null;
    ExtentReports extent = null;
    ExtentTest test = null;

    @BeforeSuite
    public void setUpTest() {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);
        test = extent.createTest("Google Search");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        test.info("set up driver");

    }

    @Test
    public void googleSearch() {
        driver.get("https://google.com");
        test.pass("Navigated to google.com");

        driver.findElement(By.name("q")).sendKeys("Automation step by step");
        test.pass("Enterd text in SearchBox");

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test.pass("Pressed enter key");

    }

    @AfterSuite
    public void tearDownTest() {
        driver.close();
        test.pass("Entered text in SearchBox");

        extent.flush();
    }
}
