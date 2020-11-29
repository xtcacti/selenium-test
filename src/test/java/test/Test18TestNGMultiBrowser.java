package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test18TestNGMultiBrowser {

    WebDriver driver =  null;

    @BeforeTest
    @Parameters("browserName")
    public void setup(String browserName){
        System.out.println("browserName:" + browserName);
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browserName.equals("ie")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(4000);
    }

    @AfterTest
    public void teardown(){
        driver.close();
        System.out.println("Completed!");
    }
}
