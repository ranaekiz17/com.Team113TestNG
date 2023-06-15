package tests.StudyMyself;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Study02 extends TestBaseRapor {
    AmazonPage amazonPage = new AmazonPage();


    @Test
    public void test01(){
        extentTest = extentReports.createTest("Amazon_HERSEY'S");
        //amazon.com ye gidin
        Driver.getDriver().get("https://www.amazon.com/");

        amazonPage.aramaKutusu.sendKeys("HERSHEY'S" + Keys.ENTER);

        // sonuclarin Nutella icerdigini test edelim
        String expectedicerik = "HERSHEY'S";
        String actualAramaSonucyazisi = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucyazisi.contains(expectedicerik));


        // sayfayi kapatalim
        Driver.closeDriver();

        extentTest.pass("Displayed HERSHEY'S in Amazon Page");

    }
}
