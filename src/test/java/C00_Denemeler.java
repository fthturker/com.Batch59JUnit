import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class C00_Denemeler extends TestBase {
    // 1. Bir class olusturun : EnableTest
    //2. Bir metod olusturun : isEnabled()
    @Test
    public void enableTest() {
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.

        //4. Textbox’in etkin olmadigini(enabled) dogrulayın


        //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin


        //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.


        //7. Textbox’in etkin oldugunu(enabled) dogrulayın.

    }
}