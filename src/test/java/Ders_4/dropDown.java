package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDown {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://amazon.com");
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));

        Select select=new Select(dropDown);

        select.selectByVisibleText("Baby");

        Thread.sleep(3000);

        select.selectByIndex(5);

        Thread.sleep(5000);

        select.selectByValue("search-alias=computers-intl-ship");

        WebElement secim= select.getFirstSelectedOption();
        System.out.println("SOn secili departman ==>  "+secim.getText());

        System.out.println("--------------");

        List<WebElement> liste=select.getOptions();

        for(WebElement  w:liste){
            System.out.println(w.getText());
        }

        int toplamSecenekSayisi=liste.size();
        System.out.println("Toplam secim sayisi ==> "+ toplamSecenekSayisi);

    }
}







