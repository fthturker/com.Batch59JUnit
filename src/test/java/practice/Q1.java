package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    /*
    ...Exercise1...
    BeforeClass ile driver ı olusturun ve class icinde static yapin
    Maximize edin, 15 sn bekletin
    http://www.google.com adresine gidin
    arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
    AfterClass ile kapatın

 */
    static WebDriver driver;

    //5 test 1AC 1BC 1A 1B --->17 tane test
    @BeforeClass
    public static void setUp() {
        //BeforeClass ile driver ı olusturun ve class icinde static yapin
        //    Maximize edin, 15 sn bekletin
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Before
    public void testtenonce() {
        //http://www.google.com adresine gidin
        driver.get("http://www.google.com");
    }

    @Test
    public void Test01() {
        //arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("Green Mile");
        //aramaKutusu.sendKeys("Green Mile"+Keys.ENTER);
        aramaKutusu.submit();

    }

    @Test
    public void Test02() {
        //arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("Premonition" + Keys.ENTER);
    }

    @Test
    public void Test03() {
        //arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("The Curious Case of Benjamin Button" + Keys.ENTER);
    }

    @After
    public void testenSonra() {
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("sonucYazisiElementi.getText() = " + sonucYazisiElementi.getText());
    }

    @AfterClass
    public static void tearDown() {
        //AfterClass ile kapatın
        driver.close();
    }
}
