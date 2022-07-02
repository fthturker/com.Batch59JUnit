package day08_alerts_iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_alerts {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void test01() {
        /*herhangi bir web sitesine gidince veya
        bir web sitesinde herhangi bir islem yaptigimizda
        ortaya cikan uyarilara alert diyoruz

        eger bir alert inspect yapilabiliyorsa, o alert otomasyon ile kullanilabilir
        bu tur alert'lere HTML alert denir ve bunlar icin ekstra bir islem yapmaya gerek yoktur
        tum webelementler gibi locate edip istedigimiz islemleri yapabiliriz

        driver.get("https://www.facebook.com"); da cıkan alert vb.

        Ancak web uygulamalarinda HTML alert yaninda java script alert de bulunabilir
        js alert'ler locate edilemez
        Selenium'da JS alert'ler icin cok ozel bir yontem gelistirmistir
        */
        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        //alert'te OK tusuna basin
        driver.switchTo().alert().accept();

        // result kısmında "You successfully clicked an alert" yazdıgını test edin

        String expectedResult="You successfully clicked an alert";
        WebElement sonucYazisiElementi= driver.findElement(By.xpath("//p[@id='result']"));
        String actualResultYazisi=sonucYazisiElementi.getText();

        Assert.assertEquals(expectedResult,actualResultYazisi);


    }
}
