package pages;


import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;

public class AmazonPage {



    // page class lari surekli kullandıgımız locate islemleri
    // ve varsa login gibi kucuk islevleri iceren methodlar barindirir
    //Selenium ile locate islemi veya herhangi bir islev gerceklestirmek istedigimizde
    //WebDriver objesine ihtiyac vardir

    //POM 'de Driver class'inda olsuturdugumuz
    //WebDriver driver objesini page class'larına tanimlamak icin
    //PageFactory class'ından initElements() kullanilir.


    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        // bu ayari constructor icine koyma sebebimiz :
        // page sayfalarina obje olusturularak ulasildigi icin
        // kim page sayfasini kullanmak isterse
        // page sayfasindan obje olusturmak icin, constructor calisacak
        // ve bu constructor'in icinde bulanan initElements() gerekli ayari yapmis olacak
    }


    @FindBy(id ="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[1]")
    public WebElement aramaSonucuElementi;

}
