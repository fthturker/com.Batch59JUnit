package day07_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C08_WorkClass {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test01() {
        // Arama kutusunun yanindaki kategori menusundeki
        // kategori sayisinin 45 oldugunu test edin  //toplam 28 tane var
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        List<WebElement> kategoriSayisi=select.getOptions();
        int actualKategoriSayisi=kategoriSayisi.size();
        int expectedKategoriSayisi=28;
        Assert.assertEquals(expectedKategoriSayisi,actualKategoriSayisi);
    }
    @Test
    public void test02() {
        // kategori menusunden Books secenegini secin
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Books");
        // arama kutusuna Java yazin ve aratin
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Java"+ Keys.ENTER);
        //bulunan sonuc yazisini yazdirin
        WebElement sonucYazisi=driver.findElement(By.xpath("//span[normalize-space()='1-16 of over 30,000 results for']"));
        System.out.println(sonucYazisi.getText());

        // sonucun Java kelimesini icerdigini test edin
        WebElement sonucYazisiElementi=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String sonucYazisiStr=sonucYazisiElementi.getText();
        String arananKelime="Java";

        Assert.assertTrue(sonucYazisiStr.contains(arananKelime));


    }
}