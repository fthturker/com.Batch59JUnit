package day11_faker_file;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C06_WorkClass extends TestBase {
    @Test
    public void test01() {
        // "https://webdriveruniversity.com/IFrame/index.html" sitesine gidin
        driver.get("https://webdriveruniversity.com/IFrame/index.html");
        //"Our Products" butonuna basin
        WebElement ourProducts=driver.findElement(By.xpath("a[href='products.html']"));
        ourProducts.click();
     }

}
