import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathTest {

    @Test
    public void findEkementstCss() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


        By cssID = By.xpath("//button[@id='clickOnMe']");
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


        By attTag = By.xpath("//input[@name='fname']");
        By attContains = By.cssSelector("[name*='name']");
        By attStarts = By.cssSelector("[name^='f']");
        By atrrEnds = By.cssSelector("[name$='name']");

        driver.findElement(attTag);
        driver.findElement(attContains);
        driver.findElement(attStarts);
        driver.findElement(atrrEnds);


        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thidrChild = By.cssSelector("li:nth-child(3)");

        driver.findElement(firstChild);
        driver.findElement(lastChild);
        driver.findElement(thidrChild);


        By fullPath = By.xpath("/html/body/div/ul");
        By shortPath = By.xpath("//ul");
        By classTop = By.xpath("//p[@class='topSecret']");
        driver.findElement(classTop);
        driver.findElement(fullPath);
        driver.findElement(shortPath);


        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        By partialText = By.xpath("//a[contains(text(),'Visit')]");
        driver.findElement(linkText);
        driver.findElement(partialText);

        By secondEl = By.xpath("(//input)[2]");
        driver.findElement(secondEl);

        By lastEl = By.xpath("(//input)[last()]");
        driver.findElement(lastEl);

        By elWithAtt = By.xpath("//*[@name]");
        driver.findElement(elWithAtt);

        By attEq = By.xpath("//button[@id='clickOnMe']");
        driver.findElement(attEq);

        By attNoEq = By.xpath("//button[@id!='clickOnMe']");
        driver.findElement(attNoEq);

        By contEl = By.xpath("//*[contains(@name, 'ame')]");
        driver.findElement(contEl);

        By startsEleme = By.xpath("//*[starts-with(@name, 'user')]");
        driver.findElement(startsEleme);

        By child = By.xpath("//div//child::ul");
        driver.findElement(child);

        By parent = By.xpath("//div/../..");
        driver.findElement(parent);

        By descChild = By.xpath("//div//descendant::ul"); // w dol
        driver.findElement(descChild);

        By ancChild = By.xpath("//div//ancestor::*"); // do gory
        driver.findElement(ancChild);

        By foll = By.xpath("//img/following::*"); // wystepujace po zadanym tagu
        driver.findElement(foll);

        By follSib = By.xpath("//img/following-sibling::*"); // wystepujace po zadanym tagu
        driver.findElement(follSib);

        By preci = By.xpath("//img/preceding::*"); // wystepujace po zadanym tagu
        driver.findElement(preci);

        By precSib = By.xpath("//img/preceding-sibling::*"); // wystepujace po zadanym tagu
        driver.findElement(precSib);

        By dicAndLink = By.xpath("//a | //div"); // to i to
        driver.findElement(dicAndLink);

        By andOp = By.xpath("//input[@name='fname' and @id='fname']"); // musi byc dokladnie to i to
        driver.findElement(andOp);

        By orOp = By.xpath("//input[@name='fname' or @id='bleble']"); // jedno z 2 musi byc zgodne
        driver.findElement(orOp);


    }


}
