package tests.Practise;

import org.testng.annotations.Test;

public class P01 {

    @Test (priority = 10)
    public void Aysetest01(){
        System.out.println("Isim");
    }

    @Test
    public void Nerimantest02(){
        System.out.println("İsim2");
    }

    @Test (priority = -5)
    public void Kaadirtest03(){
        System.out.println("Isim3");
    }


    //Isim3
    //İsim2
    //Isim
}
