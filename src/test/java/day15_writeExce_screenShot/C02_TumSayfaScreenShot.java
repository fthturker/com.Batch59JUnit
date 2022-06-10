package day15_writeExce_screenShot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_TumSayfaScreenShot extends TestBase {
    @Test
    public void tumSayfa() throws IOException {

        //amazon sayfasina gidip tum sayfanin fotografini cekelim
        driver.get("https://www.youtube.com");

        //1.adim
        TakesScreenshot ts = (TakesScreenshot) driver;

        //5. adim
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarih = date.format(dtf);

        //2.adim
        File tumSayfaResim = new File("target/ekranGoruntuleri/tumSayfa" + tarih + ".jpeg");

        //3.Adim
        File geciciDosya = ts.getScreenshotAs(OutputType.FILE);

        //4. Adim
        FileUtils.copyFile(geciciDosya, tumSayfaResim);
    }
}