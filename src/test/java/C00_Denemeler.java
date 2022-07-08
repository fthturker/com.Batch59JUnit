import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class C00_Denemeler extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1. Tests packagenin altina bir class oluşturalim
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //3. dummy.txt dosyasını indirelim
        WebElement dummyLinki=driver.findElement(By.xpath("//a[text()='dummy.txt']"));
        dummyLinki.click();
        Thread.sleep(3000);
        //4. dosyanın başarıyla indirilip indirilmediğini test edelim
        // dosya downloads'a indirilecektir, bize downloads'un dosya yolu lazim

        String farkliKisim= System.getProperty("user.home");
        String ortakKisim = "\\indirilenler\\dummy.txt";

        String arananDosyaYolu= farkliKisim+ortakKisim;

        // geriye o dosya yolundaki dosyanin var oldugunu assert edelim
        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYolu)));
    }
}
