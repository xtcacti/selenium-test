package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test23TestNGRetryFailed {
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test(retryAnalyzer = listensers.RetryAnalyzer.class)
    public void test3() {
        System.out.println("test3");
        Assert.assertTrue(1<0);
    }

}
