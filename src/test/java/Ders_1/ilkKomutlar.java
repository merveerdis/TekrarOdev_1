package Ders_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ilkKomutlar {

    static WebDriverManager driver;

    @Test
    public void driver_Tanimlama() throws InterruptedException {
        //Driveri kullanilabilir hale getirdik
        WebDriver driver;
        //Driveri Chromdrivere tanitiyoruz
        WebDriverManager.chromedriver().setup();
        //Driver nesnesi olusturuyoruz
        driver = new ChromeDriver();
        //sayfayi tam ekran yapiyoruz
        driver.manage().window().maximize();
        //sayfanin yuklenmesi icin driveri bekletiyoruz
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //ilk deneme
        driver.get("https://google.com");
        //calistigimiz penceereyi kapatir.

        Thread.sleep(3000);
        driver.close();
        //calistigimiz tüm pencereleri kapatir
        //driver.quit();


    }

}
