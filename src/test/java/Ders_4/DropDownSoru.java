package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownSoru {

    static WebDriverManager driver;

    @Test
    public void driver_Tanimlama() throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://amazon.com");

            WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));

            Select select=new Select(dropDown);

            select.selectByVisibleText("Software");

            Thread.sleep(3000);

            WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
            arama.sendKeys("Java" + Keys.ENTER);

            WebElement sonuc = driver.findElement(By.className("sg-col-inner"));
        System.out.println(sonuc.getText());

}}