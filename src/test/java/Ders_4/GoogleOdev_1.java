package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GoogleOdev_1 {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://google.com");
    }
    @Test
    public void test1(){
        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='Ich stimme zu']"));
        guvenlikDuvari.click();

        String titleGoogle = driver.getTitle();

        System.out.println("GoogleTitle => " + titleGoogle);

        String urlGoogle = driver.getCurrentUrl();

        System.out.println("GoogleUrl => " + urlGoogle);

        if(urlGoogle.contains("OOG")){
            System.out.println("OOG Kelimesi Var " + urlGoogle);
        }
        else{
            System.out.println("OOG Kelimesi Yok " + urlGoogle);
        }

        WebElement arama = driver.findElement(By.name("q"));
        arama.sendKeys("kulaklik" + Keys.ENTER);

    }
    @Test
    public void test2(){
        WebElement arama = driver.findElement(By.name("q"));
        arama.sendKeys("masa" + Keys.ENTER);

    }
    @Test
    public void test3(){
        WebElement arama = driver.findElement(By.name("q"));
        arama.sendKeys("sandalye" + Keys.ENTER);

    }
    @AfterMethod
    public void afterMethod(){
        WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }



}


