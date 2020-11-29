package test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.lang.reflect.Field;

public class Test03HtmlUnitDriver {
    public static void main(String[] args) throws Exception {
        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.EDGE);
        driver.get("https://selenium.dev/");
        System.out.println(driver.getTitle());

        WebClient webClient = (WebClient) get(driver, "webClient");
        System.out.println("Browser Version : " + webClient.getBrowserVersion());
        System.out.println("Is Browser Edge : "+ webClient.getBrowserVersion().isEdge());
        System.out.println("Is Browser Chrome : "+ webClient.getBrowserVersion().isChrome());

        driver.quit();
    }

    private static Object get(Object object, String field) throws Exception {
        Field f = object.getClass().getDeclaredField(field);
        f.setAccessible(true);
        return f.get(object);
    }
}
