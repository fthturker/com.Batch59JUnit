package day10_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class C07_WorkClass extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        // https://www.amazon.com sayfasina gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna actions metod'larine kullanarak samsung
        // A71 yazdirin ve Enter'a basarak arama yapin
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        Actions actions=new Actions(driver);
        actions
                .click(aramaKutusu)
                .sendKeys("s")
                .sendKeys("a")
                .sendKeys("m")
                .sendKeys("s")
                .sendKeys("u")
                .sendKeys("n")
                .sendKeys("g")
                .sendKeys(" ")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("7")
                .sendKeys("1")
                .sendKeys(Keys.ENTER).perform();

        // aramanin gerceklestigini test edin
        WebElement sonucyazisi=driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expected=sonucyazisi.getText();
        Assert.assertTrue(sonucyazisi.isDisplayed());


    }
}
