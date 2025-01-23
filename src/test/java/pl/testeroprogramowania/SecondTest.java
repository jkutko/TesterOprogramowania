package pl.testeroprogramowania;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SecondTest extends BaseTest {

    WebDriver driver;

    @Test
    public void firstTest2() throws InterruptedException {
        driver = Driver.getDriver();
        driver.manage().window();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));

        String paraTekst = driver.findElement(By.cssSelector("p")).getText();

        Assert.assertEquals(paraTekst, "Dopiero się pojawiłem!");
        driver.close();
    }


    @Test
    public void secondTest2() throws InterruptedException {

        driver = Driver.getDriver();

        driver.manage().window();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));

        String paraTekst = driver.findElement(By.cssSelector("p")).getText();

        Assert.assertEquals(paraTekst, "Dopiero się pojawiłem!");

        driver.close();
    }


//    dodawanie własnego warunku gdy expectedCond nie spełnia oczekiwan

    public void waitForElementToExist(By locator) {

        FluentWait<WebDriver> wait = new FluentWait<>(driver); // fluet nadrzedne do webdriver , musimy sami zdefinowac co ingnorowane ma byc
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10)); // ile czasu na odpytywac
        wait.pollingEvery(Duration.ofSeconds(1)); // co ile ma odpytwac
        wait.until((driver) -> {
            List<WebElement> elements = driver.findElements(locator);
            if (elements.size() > 0) {
                System.out.println("Element jest na stronie");
                return true;
            } else {
                System.out.println("Elementu nie ma na stronie");
                return false;
            }
        });

    }

//    public WebDriver getDriver(String browser){
//
//        switch (browser) {
//            case "chrome":
//                return new ChromeDriver();
//            case  "firefox":
//                return  new FirefoxDriver();
//            case "ie":
//                return new InternetExplorerDriver();
//            default:
//                throw new InvalidArgumentException("Invalid browser name");
//        }

//    }
}

