package pl.testeroprogramowania;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
//@Listeners(value = {SampleTestListener.class})

public class FirstTest extends BaseTest {

    WebDriver driver;


    @Test @Ignore
    public void firstTest(){

        driver = Driver.getDriver();

        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();


        waitForElementToExist(By.cssSelector("p"));

        String paraTekst = driver.findElement(By.cssSelector("p")).getText();

        Assert.assertEquals( paraTekst,"Dopiero się pojawiłem!");
        Assert.assertEquals(paraTekst, "Dopiero", "Teksty są różne");

        driver.close();


    }

    @Test @Ignore
    public void secondTest()  {

        driver = Driver.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));

        WebElement para = driver.findElement(By.cssSelector("p"));
        Assert.assertEquals(para.getText().startsWith("Dopiero"), "Blad"); // tu sie wywala bo twarda asercja
        Assert.assertEquals(para.isDisplayed(), true);
        Assert.assertTrue(para.isDisplayed(), "Nie ma elementu");

//        String paraTekst = driver.findElement(By.cssSelector("p")).getText();

//        Assert.assertEquals(paraTekst, "Dopiero się pojawiłem!");

        driver.close();
    }

    @Test
    public void thirdTest()  {

        driver = Driver.getDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();

        waitForElementToExist(By.cssSelector("p"));

        WebElement para = driver.findElement(By.cssSelector("p"));

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(para.getText().startsWith("Dopiero"), "Blad pierwszy"); // tu sie wywala bo twarda asercja
        softAssert.assertEquals(para.isDisplayed(), true);
        softAssert.assertTrue(para.isDisplayed(), "Nie ma elementu");
        softAssert.assertEquals(para.getText(), "Dopiero się", "Drugi błąd");

        driver.close();
        softAssert.assertAll("Sprawdzone wszystko");
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
//
//    }

    public void waitForElementToExist(By locator) {

        FluentWait<WebDriver> wait = new FluentWait<>(driver); // fluet nadrzedne do webdriver , musimy sami zdefinowac co ingnorowane ma byc
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10)); // ile czasu na odpytywac
        wait.pollingEvery(Duration.ofSeconds(1)); // co ile ma odpytwac
        wait.until((driver) -> {
            List<WebElement> elements = driver.findElements(locator);
            if(elements.size()>0) {
                System.out.println("Element jest na stronie");
                return true;
            } else {
                System.out.println("Elementu nie ma na stronie");
                return false;
            }
        });
    }




}
