import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionTest extends TestSelenium{

    @Test
    public void performAction() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.cssSelector("[href='basics.html']"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();


        driver.findElement(By.cssSelector("[id='clickOnMe']"));
        WebElement imie = driver.findElement(By.cssSelector("input[id='fname']"));
        imie.sendKeys("ABC");
        imie.clear();

        WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
        userName.clear();
        userName.sendKeys("admin");
        userName.sendKeys(Keys.ENTER);
        driver.switchTo().alert().accept();

        // przejscie na okno modalne
        Alert alertFirst = driver.switchTo().alert();
        alertFirst.accept();


        // pobieranie wartosci z pola
      //  System.out.println(userName.getAttribute("value") );



      //  userName.sendKeys(Keys.TAB);
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.clear();
        password.sendKeys("aaa");



        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='male']")).click();

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select car = new Select(selectCar);
        car.selectByValue("saab");


// pobranie elementow listy i wyswietlenie w terminalu
        List<WebElement> options = car.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());

            //pobranie wartosci listy
            // w selCheck metoda pobierajaca wart  z listy i porównanie z stringiem


            SelectCheck selectCheck = new SelectCheck();
            System.out.println(selectCheck.checkOption("Audi",selectCar));
            System.out.println(selectCheck.checkOption("Jeep",selectCar));


            WebElement paraHiden = driver.findElement(By.cssSelector(".topSecret")); // po css po klasie
            System.out.println("By text " +paraHiden.getText());
            System.out.println("By text atrr " +paraHiden.getAttribute("value"));
            System.out.println("By text cont " +paraHiden.getAttribute("textContent")); // ten wyszukuje gdy ukryte


        }












        //driver.quit();


    }

}
