package tests.Practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class P02 {

    /*
- Birbirine bağımlı testler oluşturun.
- beforeClass oluşturup setUp ayarlarini yapin.
- Birbirine bağımlı testler oluşturarak
- ilk once wisequarte'a gidin
- sonra youtube'a bağımlı olarak google'a gidin
- daha sonra amazon'a bağımlı olarak amazon' a gidin
- driver'i kapatın.
 */

    //- Birbirine bağımlı testler oluşturun.

    static WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    //ilk once wisequarte'a gidin

    @Test
    public void wiseTest(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }



}
