package pl.testeroprogramowania;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourthTest  {


    @Test(dependsOnMethods = "thirdTest")
    public void firstTest() {
        System.out.println("Pierwszy");
    }

    @Test(dependsOnMethods = "firstTest")
    public void secondTest() {
        System.out.println("Drugi");
    }

    @Test
    public void thirdTest() {
        System.out.println("Trzeci");
    }

    @Test(dataProvider = "data")
    public void dpTest(String val, String numer) {
        System.out.println(val);
        System.out.println(numer);
    }


    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        return new Object[][] {{"Pierwszy test", "bla"}, {"Drugi test", "bla2"}, {"Trzeci test", "bla3"}};



    }

}


