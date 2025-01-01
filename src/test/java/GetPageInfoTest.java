import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class GetPageInfoTest extends TestSelenium{

    @Test
    public void getInfo() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }

}
