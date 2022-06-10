package day10_actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C05_KeyboardActions extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.xpath("twotabsearchtextbox"));

        //once arama kutusuna click yapip
        //sonra harf harf Nutella yazisini yazdiralim
        //sonra da ENTER tusuna basalim

        Actions actions = new Actions(driver);

        actions.click(aramaKutusu).
                keyDown(Keys.SHIFT) // shift'te basili tutarız ve n büyük N olur
                .sendKeys("n")
                .keyUp(Keys.SHIFT) // shift'ten elimizi kaldırdik
                .sendKeys("u")
                .sendKeys("t")
                .sendKeys("e")
                .sendKeys("l")
                .sendKeys("l")
                .sendKeys("a")
                .sendKeys(Keys.ENTER).perform(); //ENTER tusuna basilir


        Thread.sleep(3000);

    }
}
