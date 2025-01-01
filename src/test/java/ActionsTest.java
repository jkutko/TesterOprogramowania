import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ActionsTest extends TestSelenium {

    @Test
    public void ActionsTest() throws IOException {

        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");

        Actions actions = new Actions(driver);
       // actions.contextClick().perform();

        //actions.contextClick(driver.findElement(By.id("myFile"))).perform(); kliknięcie na str https://testeroprogramowania.github.io/selenium/fileupload.html

        //WebElement bu = driver.findElement(By.id("bootom"));
        //        WebElement button = driver.findElement(By.id("bootom"));
        //actions.doubleClick(bu).perform();
        actions.doubleClick(driver.findElement(By.id("bootom")));
        actions.perform();
       // bu.click();
      //  bu.click();

    }

}
