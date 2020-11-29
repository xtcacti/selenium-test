package listensers;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class Test16Listeners02 implements ITestListener {
    @Test
    public void test4() {
        System.out.println("test4");
    }

    @Test
    public void test5() {
        System.out.println("test5");
    }

    @Test
    public void test6() {
        System.out.println("test6");
    }
}
