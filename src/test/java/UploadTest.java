import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class UploadTest extends TestSelenium {

    @Test
    public void UploadFileTest() throws IOException {

        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        int randomNumner = (int) (Math.random()*1000);
        String fileName = "beforeUpload" + randomNumner +".png";
        String fileNameAfter = "afterUpload" + randomNumner +".png";


        // zrzut ekranu

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File beforeFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(beforeFile, new File("src/test/resources/" +fileName));

        driver.findElement((By.id("myFile"))).sendKeys("C:\\Users\\j.utko\\Desktop\\seleniumTesterOprogramowania\\seleniumFile.txt");
        File afterFile = screenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(afterFile, new File("src/test/resources/" +fileNameAfter));

        driver.quit();




    }

}
