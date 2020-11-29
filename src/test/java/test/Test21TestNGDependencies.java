
package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test21TestNGDependencies {
//    @Test(dependsOnMethods = {"test2","test3"},priority = 1)
    @Test(dependsOnGroups = {"sanity1"})
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = {"sanity1"})
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }
}
