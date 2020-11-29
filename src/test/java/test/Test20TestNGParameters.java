package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test20TestNGParameters {

    @Test
    @Parameters("MyName")
    public void test(@Optional("lxt") String name){
        System.out.println("Name is:" + name);
    }
}
