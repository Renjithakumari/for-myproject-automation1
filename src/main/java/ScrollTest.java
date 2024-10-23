import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollTest {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name=driver.findElement(By.id("name"));
        Actions actions=new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Renjitha");
        WebElement date=driver.findElement(By.id("date"));
        date.sendKeys("20/20/2020");
        Thread.sleep(1000);
        driver.quit();
    }
}
