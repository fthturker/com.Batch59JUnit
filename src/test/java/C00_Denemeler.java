import day14_excel.C03_readExcel;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class C00_Denemeler extends TestBase {
    @Test
    public void webElementSS() throws IOException, InterruptedException {

            // amazon'a gidelim
            driver.get("https://www.amazon.com");

            // asagidaki sign in butonu gorununceye kadar js ile scrool yapalim
        JavascriptExecutor je= (JavascriptExecutor) driver;
        WebElement signInButonu= driver.findElement(By.xpath("//span[text()='Sign in'])[2]"));
        je.executeScript("arguments[0].scrollIntoView(true);",signInButonu);

            // sign in butonuna js ile click yapalim
        je.executeAsyncScript("arguments[0].click();",signInButonu);
        Thread.sleep(3000);
        }
    }
