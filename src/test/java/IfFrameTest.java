import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class IfFrameTest extends TestSelenium {


    @Test
    public void ifFrame() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");

        WebElement iframa = driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(iframa); // po web elemence

      //  driver.switchTo().frame(0); // szukanie po indexie, numerowanie od 0

        driver.findElement(By.id("fname")).sendKeys("Justyna");
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());

        driver.close();



    }
}
