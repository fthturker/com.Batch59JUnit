package day07_Assertions;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_WorkClass {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://youtube.com");
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        // titleTest sayfa basliginin "YouTube" oldugunu test edin

        String expectedTitle="YouTube";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Test
    public void test02() {
        // imageTest YouTube resminin goruntulendigini (isDisplayed()) test edin
        WebElement image = driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(image.isDisplayed());
    }
    @Test
    public void test03() {
        // Search Box 'in erisilebilir oldugunu test edin
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searchBox.isEnabled());
    }
    @Test
    public void test04() {
        // wrongTitleTest sayfa basliginin "youtube" olmadigini dogrulayin
        String expectedWrongTitle="youtube";
        String actualTitle=driver.getTitle();
        Assert.assertFalse(actualTitle.contains(expectedWrongTitle));
    }
}