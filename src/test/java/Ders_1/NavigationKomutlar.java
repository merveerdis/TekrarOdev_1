package Ders_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationKomutlar {

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
        //herhangi bir sayfaya gitmek icin kullaniyoruz
        driver.get("https://google.com");
        //2 saniye durduruyor
        Thread.sleep(2000);
        //bulundugumuz sayfadan baska bir sayfaya gitmemizi saglar
        driver.navigate().to("https://amazon.com");

        Thread.sleep(2000);
        //geldigimiz sayfaya geri dönmemizi saglar
        driver.navigate().back();
        //geri döndügümüz sayfadan tekrar geldigimiz sayfaya gelmemizi saglar
        driver.navigate().forward();
        //calistigimiz sayfayi buyutmeye yariyor
        driver.manage().window().maximize();
        //bulundugumuz sayfayi yeniler
        driver.navigate().refresh();
        //calistigimiz penceereyi kapatir.
        driver.close();
        //calistigimiz tüm pencereleri kapatir
        //driver.quit();


    }

}
