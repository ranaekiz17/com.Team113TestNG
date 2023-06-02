package tests.StudyMyself;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class Study01 {

    @Test(groups = "smoke")
    public void test01() {

        //QUALITYDEMY ANA SAYFAYA GIDIN
        Driver.getDriver().get("https://www.cambly.com/english");

    }
}