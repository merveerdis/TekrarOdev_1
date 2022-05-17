package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;

public class GoogleOdevKnrlp {



        static WebDriver driver;
        static int counter = 0;
        @BeforeClass
        public static void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        @BeforeMethod
        public static void googleSetUp() throws InterruptedException {
            driver.get("https://google.com");
            String title = driver.getTitle();
            String url = driver.getCurrentUrl();
            if (title.equalsIgnoreCase("Google") && url.equalsIgnoreCase("https://www.google.com/")) {
                System.out.println("Dogru sayfadasiniz");
            } else {
                System.out.println("Yanlis sayfadasiniz");
            }
            guvenlikDuvari();
        }
        @Test
        public void test1() throws InterruptedException {
//            WebElement iAgreeButton = driver.findElement(By.xpath("//*[.='I agree']"));
//            iAgreeButton.click();
//            sleep(1500);
            WebElement searchBox = driver.findElement(By.xpath("//*[@name = 'q']"));
            searchBox.sendKeys("Kulaklik" + Keys.ENTER);
            counter++;
        }
        @Test
        public void test2() throws InterruptedException {
            sleep(1500);
            WebElement searchBox = driver.findElement(By.xpath("//*[@name = 'q']"));
            searchBox.sendKeys("Masa" + Keys.ENTER);
            counter++;
        }
        @Test
        public void test3() throws InterruptedException {
            sleep(1500);
            WebElement searchBox = driver.findElement(By.xpath("//*[@name = 'q']"));
            searchBox.sendKeys("Sandalye" + Keys.ENTER);
            counter++;
        }
        @AfterMethod
        public static void getResults() {
            WebElement results = driver.findElement(By.cssSelector("div#result-stats"));
            if (counter == 1) {
                System.out.println("Kulakliklarin sonucu: " + results.getText());
            } else if (counter == 2) {
                System.out.println("Masalarin sonucu: " + results.getText());
            } else {
                System.out.println("Sandalyelerin sonucu: " + results.getText());
            }
        }
        @AfterClass
        public static void tearDown() {
            driver.close();
        }
        public static void guvenlikDuvari() throws InterruptedException {
            try {
                WebElement iAgreeButton = driver.findElement(By.xpath("//*[.='I agree']"));
                iAgreeButton.click();
                sleep(1500);
            } catch (NoSuchElementException a) {
                System.out.println("Guvenlik duvari burada bulunmamaktadir");
            }
        }
    }


