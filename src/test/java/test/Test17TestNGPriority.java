package test;

import org.testng.annotations.Test;

public class Test17TestNGPriority {
    @Test(priority = 2)
    public void one(){
        System.out.println("test1");
    }

    @Test(priority = 2)
    public void two(){
        System.out.println("test2");
    }

    @Test(priority = 2)
    public void three(){
        System.out.println("test3");
    }
}
