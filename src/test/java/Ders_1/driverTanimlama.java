package Ders_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class driverTanimlama {

    static WebDriverManager driver;

    @Test
        public void driver_Tanimlama(){
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


    }
}
