import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PierwszyTest extends TestSelenium {



    @Test
            public void pierwszyTest()  {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");


        WebElement agreeButton = driver.findElement(By.xpath("//div[@class='QS5gu sy4vM'])[position()=2]"));
        agreeButton.click();
        WebElement serchField = driver.findElement(By.name("q"));
        serchField.sendKeys("Selenium");
        serchField.sendKeys(Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev']//h3"));

        Assert.assertTrue(result.isDisplayed());

    }


    @Test
    public void drugiTest() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        WebElement seleniumProduct = driver.findElement(By.xpath("//h2[text()='Java Selenium WebDriver']"));
        Assert.assertTrue(seleniumProduct.isDisplayed());
        driver.quit();
    }
}
