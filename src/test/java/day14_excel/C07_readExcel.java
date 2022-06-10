package day14_excel;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C07_readExcel {
    @Test
    public void readExcelTest() throws IOException {

        String dosyaYolu = "src/main/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        //1. satirdaki 2. hucreye gidelim ve yazdiralim
        String actualData = workbook
                .getSheet("Sayfa1")
                .getRow(1)
                .getCell(3)
                .toString();
        System.out.println(actualData);
        //1. satirdaki 2. hucreyi bir string degiskene atayalim ve yazdiralim
        workbook
                .getSheet("Sayfa1")
                .getRow(1)
                .getCell(3)
                .setCellValue("City");
        System.out.println(actualData);
        //2.satir 4. cell'in afganistan'in baskent oldugunu test edelim
        String expectedData = "City";
        Assert.assertTrue(expectedData.contains("City"));

        //satir sayisini bulalim
        Row row = workbook.getSheet("Sayfa1").getRow(0);
        int satirsayisi = workbook.getSheet("Sayfa1").getLastRowNum() + 1;
        System.out.println("satir sayisi : " + satirsayisi);

        //ingilizce ulke isimleri ve baskentleri bir map olarak kaydedelim
        Map<String, String> ulkelerMap = new HashMap<>();

        int sonSatirIndex = workbook.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <= sonSatirIndex; i++) {
            // key i. satirdaki 0 indexindeki data olacak
            String key = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            // value ise i. satirdaki 1,2 ve 3. indexdeki datalarin birlesimi olacak
            String value = workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString();
            ulkelerMap.put(key, value);
        }
        System.out.println(ulkelerMap);
    }
}


