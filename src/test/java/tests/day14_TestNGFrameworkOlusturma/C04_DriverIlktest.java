package tests.day14_TestNGFrameworkOlusturma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DriverIlktest {

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys(new CharSequence[]{"Nutella" + Keys.ENTER});
        WebElement sonucElementi = Driver.getDriver().findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = sonucElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
