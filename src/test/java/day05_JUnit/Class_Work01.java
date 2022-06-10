package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Class_Work01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");

        // 2-arama kutusunu locate edilim
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Samsung headphones");

        // 3-"Samsung headphones" ile arama yapalim
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        // 4-bulunan sonuc sayisini yazdiralim
        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        System.out.println(sonucSayisi.getText());

        // 5-ilk urunu tiklayalim
        driver.findElement(By.xpath("//img[@class='s-image']")).click();

        // 6-sayfadaki tum basliklari yazdiralim
        System.out.println("sayfa basligi: " + driver.getTitle());

        driver.close();


    }
}
