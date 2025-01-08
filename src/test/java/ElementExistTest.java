import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ElementExistTest extends TestSelenium {

    WebDriver driver;

    @Test
    public void ElementExist() {

        driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        System.out.println(elementExist(By.tagName("p")));
        System.out.println(elementExist(By.id("topSecret")));

        System.out.println(elementExistSecond(By.tagName("p")));
        System.out.println(elementExistSecond(By.id("topSecret")));

    // spr czy element jest wyświetlony

        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("button")).isDisplayed());


        // czy dostepny
        System.out.println(driver.findElement(By.tagName("button")).isEnabled());

        // spr czy checbox jest zaznaczony
        System.out.println("-------------------------");
        WebElement chexkbox = driver.findElement(By.cssSelector("[type='checkbox']"));
        System.out.println(chexkbox.isSelected());
        chexkbox.click();
        System.out.println(chexkbox.isSelected());

        driver.quit();





    }

    //spr czy element istnieje

    public boolean elementExist(By locator) {
       try {
           driver.findElement(locator);
           return true;
       } catch (NoSuchElementException ex) {
           return false;
       }
    }

//  inna metoda


    public boolean elementExistSecond(By locator) {

        return driver.findElements(locator).size() >0;
        
    }

}
