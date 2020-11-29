package test;

import org.testng.annotations.Test;

@Test(groups = {"all"})
public class Test19TestNGGroup {

    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = {"sanity","smoke"})
    public void test2(){
        System.out.println("test2");
    }

    @Test(groups = {"linux.regresstion"})
    public void test3(){
        System.out.println("test3");
    }

    @Test(groups = {"window.regresstion"})
    public void test4(){
        System.out.println("test4");
    }

    @Test
    public void test5(){
        System.out.println("test5");
    }

}
