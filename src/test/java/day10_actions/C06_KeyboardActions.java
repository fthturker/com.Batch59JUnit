package day10_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C06_KeyboardActions extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        // facebook ana sayfaya gidip
        driver.get("https://www.facebook.com");

        // yeni kayit olustur butonuna basin
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        // isim kutusunu locate edip,
        WebElement isimKutusu = driver.findElement(By.xpath("//input[@name='firstname']"));

        // geriye kalan alanlari TAB ile dolasarak
        // formu doldurun

        Actions actions = new Actions(driver);
        actions.click(isimKutusu).
                sendKeys("Fatih")
                .sendKeys(Keys.TAB)
                .sendKeys("Turker")
                .sendKeys(Keys.TAB)
                .sendKeys("fthturker80@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("fthturker80@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("April")
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("1981")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .click().perform();

        Thread.sleep(3000);
    }
}
