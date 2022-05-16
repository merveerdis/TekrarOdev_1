package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TekrarOdev_1 {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
    }
    @BeforeMethod
    public void beforeMethod() {

    }
    @Test
    public void test1() throws InterruptedException {
        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
        arama.click();
        arama.sendKeys("bilgisayar" + Keys.ENTER);
        driver.navigate().to("https://facebook.com");
        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='Erforderliche und optionale Cookies erlauben']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();
        driver.navigate().refresh();
        driver.navigate().back();
        WebElement arama2 = driver.findElement(By.id("twotabsearchtextbox"));
        arama2.click();
        arama2.clear();
        arama2.sendKeys("s22" + Keys.ENTER);
        WebElement sonuc = driver.findElement(By.className("sg-col-inner"));
       System.out.println("s22: " + sonuc.getText());
       // WebElement sonuc2 = driver.findElement(By.xpath("//*[.='1-16 von 588 Ergebnissen oder Vorschlägen für']"));
        //System.out.println("s22: " + sonuc2.getText());
    }
   // @AfterClass
    //public static void teardown(){
        //driver.close();
    }




