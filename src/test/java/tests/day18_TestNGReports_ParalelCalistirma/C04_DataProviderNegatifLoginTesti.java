package tests.day18_TestNGReports_ParalelCalistirma;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProviderNegatifLoginTesti {
    @DataProvider
    public static Object[][] YanliskullaniciAdlariListesi() {

        String [][] kullaniciBilgileriArrayi = {{"Memre","12345"},{"Mustafa","23456"},
                                                 {"Burcu","32546"},{"Cigdem","32569"}};
        return kullaniciBilgileriArrayi;
    }

    // verilen 10 kullanici bilgisi ile
    // sisteme giris yapilamadıgını test  edin

    @Test(dataProvider = "YanliskullaniciAdlariListesi")
    public void gecersizIsimSifreTesti(String kullaniciAdi,String password) {
        // QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login linkine tiklayin

        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // gecersiz username ve sifre yi ilgili kutulara yazin

        qualitydemyPage.emailKutusu.sendKeys(kullaniciAdi);
        qualitydemyPage.passwordKutusu.sendKeys(password);

        // login butonuna basin
        qualitydemyPage.loginButonu.click();

        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());
        // sayfayi kapatin

        Driver.closeDriver();
    }


}
