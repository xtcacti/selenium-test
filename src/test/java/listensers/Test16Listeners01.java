package listensers;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listensers.TestNGListeners.class)
public class Test16Listeners01 implements ITestListener {
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(false);
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
}
