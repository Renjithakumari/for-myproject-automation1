import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class DrpDown {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Renjitha,Anoop,Aaarush");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement cPath= driver.findElement(By.className("pac-item"));
        cPath.click();

        driver.quit();
    }
}
