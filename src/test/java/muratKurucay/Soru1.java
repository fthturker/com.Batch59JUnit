package muratKurucay;

import org.junit.Test;
import utilities.TestBase;

public class Soru1 extends TestBase {
    @Test
    public void test01(){
        //Bir Class olusturun D19_WebtablesHomework
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        System.out.println("TASK1");
        driver.get("https://demoqa.com/webtables");

        //  2. Headers da bulunan department isimlerini yazdirin
        // //div[@class = 'rt-resizable-header-content']
        //div[@class = 'rt-tr-group']//div[@class='rt-td'][6]
        System.out.println("TASK2");
        System.out.println("--------");

        //  3. 3. sutunun basligini yazdirin
        System.out.println("TASK3");
        System.out.println("--------");


        //  4. Tablodaki tum datalari yazdirin
        // //div[@class = 'rt-tbody']
        System.out.println("TASK4");
        System.out.println("--------");

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        // //div[@class = 'rt-tbody']//div[@class='rt-td']
        System.out.println("TASK5");
        System.out.println("--------");

        //  6. Tablodaki satir sayisini yazdirin
        //div[@class = 'rt-tr-group']
        System.out.println("TASK6");
        System.out.println("--------");

        //  7. Tablodaki sutun sayisini yazdirin
        System.out.println("TASK7");
        System.out.println("--------");

        //  8. Tablodaki 3.kolonu yazdirin
        //div[@class = 'rt-tr-group']//div[@class='rt-td'][3]
        System.out.println("TASK8");
        System.out.println("--------");

        ////  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //div[@class = 'rt-tr-group']//div[@class='rt-td'][1]
        //div[@class = 'rt-tr-group']//div[@class='rt-td'][5]
        System.out.println("TASK9");
        System.out.println("--------");

        // 10. Page sayfasinda bir method olusturun,
        // Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin


    }
}
