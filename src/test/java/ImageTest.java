import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageTest extends TestSelenium {

    WebDriver driver;

    @Test
    public void ImageTest() {

        driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/image.html");
//        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement image = driver.findElement(By.tagName("img"));
        String height = image.getAttribute("naturalHeight");

        Assert.assertEquals(height, "0");




        driver.close();





    }

}
