import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestSelenium {



@Test
        public void openGooglePage(){

   WebDriver driver = getDriver("firefox");
   driver.get("https://www.google.com");


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
