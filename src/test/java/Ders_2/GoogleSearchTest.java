package Ders_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

    static WebDriver driver;

    @Test
    public void driverTanimla() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='Ich stimme zu']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        WebElement bosluk = driver.findElement(By.name("q"));
        bosluk.sendKeys("city bike" + Keys.ENTER);

       // bosluk.click(); oluyor mu dene tiklanacak bir sey olmadigi icin olmuyor
        //bosluk.submit(); oluyor mu dene

        WebElement sonuc = driver.findElement(By.id("result-stats"));
        System.out.println("city bike : " + sonuc.getText());

        WebElement shopping = driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();

    }
}
