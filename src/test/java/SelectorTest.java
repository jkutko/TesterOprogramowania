import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest  {


    @Test
    public void findEkementst(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By buttonId = By.id("clickOnMe");
        WebElement clickOnMe = driver.findElement(buttonId);

        //clickOnMe.click();

        //By firstname = By.name("fname");
        //WebElement firstNameInput = driver.findElement(firstname);

        WebElement firstNameInput = driver.findElement(By.name("fname"));
        firstNameInput.sendKeys("abc");


        WebElement topSecret = driver.findElement(By.className("topSecret"));
        //Assert.assertTrue(topSecret.isDisplayed());

        WebElement input2 = driver.findElement(By.tagName("input"));
        input2.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println(inputs.size());

    }

}
