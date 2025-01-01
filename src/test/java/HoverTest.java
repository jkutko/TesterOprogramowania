import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest extends TestSelenium {

    @Test
    public void HoverTest() {

        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        Actions actions = new Actions(driver);
        WebElement heading = driver.findElement(By.tagName("h1"));
        actions.moveToElement(heading).perform();



    }

}
