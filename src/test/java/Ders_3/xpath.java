package Ders_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class xpath {

    WebDriver driver;
    @Test
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://gcreddy.com/project/admin/login.php");

        WebElement userName= driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("gcreddy");
        WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("Temp@2020");
        WebElement login = driver.findElement(By.xpath("//button[@id='tdb1']"));
        login.click();


    }


}