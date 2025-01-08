import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium {

WebDriver driver;

@Test
        public void openGooglePage(){

   driver = getDriver("firefox");
   driver.get("https://www.google.com");

   //okno z cookie
    driver.switchTo().frame(0);

    // znalezienie przycisku
    WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(), 'Zgadzam')]"));

    //klikniecie przycisku
    agreeButton.click();

    // powrór do pierwotnego okna
    driver.switchTo().defaultContent();

    // znajdz pole wyszukiwania
    WebElement searchField = driver.findElement(By.name("q"));

    // wprowadzenie wartosci Selenium do pola
    searchField.sendKeys("selenium");

    // wciśniecie enter
    searchField.sendKeys(Keys.ENTER);

    // znalezc rezultat
    WebElement result = driver.findElement(By.xpath("//a[contains(@href, 'selenium.dev')]//span"));

    Assert.assertTrue(result.isDisplayed());

}

    public WebDriver getDriver(String browser){

    switch (browser) {
        case "chrome":
            return new ChromeDriver();
        case  "firefox":
            return  new FirefoxDriver();
        case "ie":
            return new InternetExplorerDriver();
        default:
            throw new InvalidArgumentException("Invalid browser name");
        }

    }
}
