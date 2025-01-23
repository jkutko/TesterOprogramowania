package pl.testeroprogramowania;

import org.testng.annotations.*;


public class BaseTest {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Przed test setem");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Przed klasa");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Przed testem");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Przed metodą");
//        setup();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Po metodzie");
    }
    
    @AfterTest
    public void afterTest() {
        System.out.println("Po tescie");
    }


    @AfterSuite
    public void afterSuit() {
        System.out.println("Po test setem");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Po klasa");
    }

//    public void setup(){
//        WebDriver driver = getDriver("chrome");
//        driver.manage().window();
//        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
//        driver.findElement(By.id("clickOnMe")).click();
//
//
//
//    }
//    public void waitForElementToExist(By locator) {
//
//        FluentWait<WebDriver> wait = new FluentWait<>(driver); // fluet nadrzedne do webdriver , musimy sami zdefinowac co ingnorowane ma byc
//        wait.ignoring(NoSuchElementException.class);
//        wait.withTimeout(Duration.ofSeconds(10)); // ile czasu na odpytywac
//        wait.pollingEvery(Duration.ofSeconds(1)); // co ile ma odpytwac
//        wait.until((driver) -> {
//            List<WebElement> elements = driver.findElements(locator);
//            if(elements.size()>0) {
//                System.out.println("Element jest na stronie");
//                return true;
//            } else {
//                System.out.println("Elementu nie ma na stronie");
//                return false;
//            }
//        });
//    }



}


