package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Assertions {
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
        driver.close();
    }

    @Test
    public void test01() {
        /*
        eger test method'umuzda hicbir test yoksa, test calistiktan sonra
        hic bir problemle karsilasilmadigini raporlamak icin "test passed" yazisi cikar

        eger testleri if ile yaparsak
        test faield olsa bile kodlar problemsiz calistigi icin
        kod calismasi bittiginde
        ekranın sol alt kısmında test passed yazacaktir
         */
        driver.get("https://www.amazon.com");

        /*
         url'in  url'in https://www.facebook.com oldugunu test edin
        if (driver.getCurrentUrl().equals("https://www.facebook.com")){
            System.out.println("url testi PASSED");
        }else{
            System.out.println("url testi FAILED");
        } oldugunu test edin
        if (driver.getCurrentUrl().equals("https://www.facebook.com")){
            System.out.println("url testi PASSED");
        }else{
            System.out.println("url testi FAILED");
        }
         */

        String expectedUrl="https://www.facebook.com";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals("url beklenenden farkli",expectedUrl,actualUrl);

        /*
        Assert ile yaptigimiz testlerde assertion failed olursa
        java kodlarin calismasini durdurur ve assert class'i
        bizi hata konusunda bilgilendirir
                org.junit.ComparisonFailure: url beklenenden farkli
                Expected :https://www.facebook.com
                Actual   :https://www.amazon.com/
                <Click to see difference>

        boylece hatanin ne oldugunu arastirmamiza gerek kalmadan
        JUnit bize raporlamis olacak
         */

    }
}
