package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
    WebDriver driver = null;
    By textbox_search = By.id("lst-ib");

    By button_search = By.name("btnK");

    public GoogleSearchPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void setTextInSearchBox(String text){
        driver.findElement(textbox_search).sendKeys(text);
    }

    public void setTextInSearchBox(Keys key){
        driver.findElement(textbox_search).sendKeys(key);
    }

    public void clickSearchButton(){
        driver.findElement(button_search).sendKeys(Keys.ENTER);
    }
}
