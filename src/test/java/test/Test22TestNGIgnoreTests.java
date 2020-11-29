
package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class Test22TestNGIgnoreTests {
    @Test
//    @Ignore
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }
}
