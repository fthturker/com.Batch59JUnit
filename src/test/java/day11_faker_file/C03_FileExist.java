package day11_faker_file;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {
    @Test
    public void test01() {
        System.out.println(System.getProperty("user.dir"));
        //bana icinde projenin dosya yolunu (path) verir

        System.out.println(System.getProperty("user.home"));
        //C:\Users\fturker80 yani bilgisayarimin bana ozel kismini verdi

        // homePath + "/Downloads"

        // "C:\Users\fturker80\Downloads"
        // "C:\Users\fturker80\Desktop"
        // C:\Users\fturker80\IdeaProjects\com.Batch59JUnit\src\test\java\day06_radioButton_checkBox

        //Masa ustumuzdeki text dosyasinin varligini test edin
        // "C:\Users\fturker80\Desktop\Yeni Metin Belgesi.txt"
        String dosyaYolu = System.getProperty("user.home") + "\\Desktop\\Yeni Metin Belgesi.txt";
        System.out.println(dosyaYolu);

        /*Bilgisayarimizdaki bir dosyanin varligini test etmek icin once o dosyaya ulasmamiz gerekir
        javada dosyaya erisim icin dosya yoluna yani path e ihtiyac vardir
        Her bilgisayarin kullanici adi farkli olacagindan masa ustu
        dosya yoluda birbirinden farkli olacaktir
        testlerimizin tum bilgisayarlarda calismasi icin
        dosya yolunu DINAMIK yapmak zorundayiz
        */

        //bunun icin her bilgisayarin birbirinden farkli olan yolunu bulmak icin
        String farkliKisim = System.getProperty("user.home");

        //herkesin bilgisayarinda ortak olan kisim ise
        String ortakKisim = "\\Desktop\\Yeni Metin Belgesi.txt";

        String masaUstuDosyaYolu = farkliKisim + ortakKisim;

        System.out.println(Files.exists(Paths.get(masaUstuDosyaYolu)));

        Assert.assertTrue(Files.exists(Paths.get(masaUstuDosyaYolu)));

    }
}
