package pl.testeroprogramowania;

import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {


    @Test(priority = 2)
    public void firstTest() {
        System.out.println("Pierwszy");
    }

    @Test(priority = 0)
    public void secondTest() {
        System.out.println("Drugi");
    }

    @Test(priority = 1)
    public void thidrTest() {
        System.out.println("Trzeci");
    }


}


