import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTestCss {

    @Test
    public void findEkementstCss() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


        By cssID = By.cssSelector("#clickOnMe");
        driver.findElement(cssID);


        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);


        By tagNameCss = By.cssSelector("input");
        driver.findElement(tagNameCss).sendKeys("testeroprogramowania");

        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        By cssClass2 = By.cssSelector("[class='topSecret']");
        driver.findElement(cssClass2);




/*
     $$("*") - wszystkie elementy na stronie
     $$("table tr") - tr szukamy wew table - w całej strukturze table
     $$("div ul") - listy na stronie

     $$("div > ul ")- bezpośrednie dziecko; pierwszy element; 1 dziecko  - rodzic nad bezpośrednio
     $$(tbody > tr ")- bo po tbody jest tr
     $$("label + form") zwraca 1 formularz po tagu label - tu nie ma rodzica
     $$("label ~ form") zwraca wszystkie formularze po tagu label - tu nie ma rodzica


*/
        By all = By.cssSelector("*");
        driver.findElement(all);


        By ulInDiv = By.cssSelector("div ul");
        By trInTable = By.cssSelector("table tr");
        By trInBody = By.cssSelector("tbody tr");
        driver.findElement(ulInDiv);
        driver.findElement(trInTable);
        driver.findElement(trInBody);

        By firstChildIndiv = By.cssSelector("div > ul");
        By firstChildInTbody = By.cssSelector("tbody > tr");
        driver.findElement(firstChildIndiv);
        driver.findElement(firstChildInTbody);


        By firstFormAfterLabel = By.cssSelector("label + form");
        By allFormAfterLabel = By.cssSelector("label ~ form");
        driver.findElement(firstFormAfterLabel);
        driver.findElement(allFormAfterLabel);


    }


}
