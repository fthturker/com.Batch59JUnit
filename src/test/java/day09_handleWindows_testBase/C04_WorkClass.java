package day09_handleWindows_testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WorkClass {
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
    public void test01() throws InterruptedException {
        // amazon sayfasina gidin
        driver.get("https://www.amazon.com");

        //sayfa'nin window handle degerini String bir degiskene atayin

        String windowHandle=driver.getWindowHandle();
        String ilkSayfaWindowHandleDegeri= driver.getWindowHandle();

        //sayfa title'nin "Amazon" icerdigini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        Assert.assertTrue(actualTitle.contains(arananKelime));

        // yeni bir tab olusturup, acilan tab'da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.techproeducation.com");

        // sayfa title'nin "TECHPROEDUCATION" icerdigini test edin
        String actualTitle1=driver.getTitle();
        String arananKelime1="TECHPROEDUCATION";
        Assert.assertFalse(actualTitle1.contains(arananKelime1));

        // yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");

        // sayfa title'nin "Walmart" icerdigini test edin
        String actualTitle2=driver.getTitle();
        String arananKelime2="Walmart";
        Assert.assertTrue(actualTitle.contains(arananKelime));

        // ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(ilkSayfaWindowHandleDegeri);
        WebElement logoElementi=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(logoElementi.isDisplayed());
        Thread.sleep(3000);
    }
}
