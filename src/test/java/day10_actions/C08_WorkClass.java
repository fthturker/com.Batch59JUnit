package day10_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C08_WorkClass extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        // "https://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("https://webdriveruniversity.com/Actions");

        // "Hover over Me First" kutusunun ustune gelin
        Actions actions=new Actions(driver);
        WebElement hoverMeFirst=driver.findElement(By.xpath("//button[normalize-space()='Hover Over Me First!']"));
        actions.contextClick(hoverMeFirst).perform();

        // "Link 1" e tiklayin
        WebElement link1=driver.findElement(By.xpath("//div[@class='dropdown hover']//a[@class='list-alert'][normalize-space()='Link 1']"));
        link1.click();

        // Popup mesajini yazdirin
        String expectedYazi="Well done you clicked on the link!";
        String actualYazi=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedYazi,actualYazi);
        System.out.println(actualYazi);

        // Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        // "Click and hold" kutusuna basili tutun
        WebElement clickAndHold=driver.findElement(By.xpath("//div[@id='click-box']"));
        actions.clickAndHold(clickAndHold).perform();

        // "Click and hold" kutusunda cikan yaziyi yazdirin

        System.out.println(clickAndHold.getText());

        // "double click me" butonuna cift tiklayin
        WebElement doubleClickMe=driver.findElement(By.xpath("//h2[normalize-space()='Double Click Me!']"));
        actions.doubleClick(doubleClickMe).perform();

        driver.close();
    }

}
