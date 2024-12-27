import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.collections.Sets;

import java.util.Set;

public class NewWindowTest extends TestSelenium {


    @Test
    public void testNewWindow() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.cssSelector("[href='basics.html']"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();
        String currentWindow = driver.getWindowHandle();
        driver.findElement(By.id("newPage")).click();


        Set<String> windowNames = driver.getWindowHandles();
        for (String window :windowNames) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }

//        By zaakceptuj = By.xpath("button[id='L2AGLb']");
//        driver.findElement(zaakceptuj).click();

        driver.findElement(By.name("q")).sendKeys("Selenium");



    }
}
