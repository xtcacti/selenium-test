package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelUnitls;

public class Test15ExcelDataProvider {
    WebDriver driver = null;

    @BeforeTest
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDownTest() {
        driver.close();
        driver.quit();
        System.out.println("Done!");
    }

    @Test(dataProvider = "test1data")
    public void test1(String userName,String password) throws InterruptedException {
        driver.get("https://www.zhihu.com/signin");
        driver.findElement(By.xpath("//div[text()='密码登录']")).click();
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @DataProvider(name = "test1data")
    public Object[][] getData(){
        String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath + "/excel/data.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }


    public static Object[][] testData(String excelPath, String sheetName) {
        ExcelUnitls excel = new ExcelUnitls(excelPath, sheetName);
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount-1][colCount];
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = excel.getCellDataString(i, j);
//                System.out.print(cellData +" | ");
                data[i-1][j] = cellData;
            }
            System.out.println();
        }
        return data;
    }
}
