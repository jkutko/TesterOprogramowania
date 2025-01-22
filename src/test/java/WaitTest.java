import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitTest extends TestSelenium {

    WebDriver driver;

    @Test
    public void WaitTest() throws InterruptedException {

        driver = getDriver("chrome");
        driver.manage().window();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // dla całego skryptu definujemy , dla wszystkich elementow wait na stronie
        driver.findElement(By.id("clickOnMe")).click();

//        Thread.sleep(5000); //na sztywno wbity TimeOut



//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // webdriver odpytuje co 1s do zadanego czasu, domyslnie igoruje wyjatki np nosuchelementExe
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));



        FluentWait<WebDriver> wait = new FluentWait<>(driver); // fluet nadrzedne do webdriver , musimy sami zdefinowac co ingnorowane ma byc
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10)); // ile czasu na odpytywac
        wait.pollingEvery(Duration.ofSeconds(1)); // co ile ma odpytwac 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p"))); //jak nie ma na stronie to w taki sposob bo inaczej na stronie nie ma i poleci NoSuchExpection


        driver.findElement(By.cssSelector("p"));
        driver.close();





    }

}
