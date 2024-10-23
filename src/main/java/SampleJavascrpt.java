import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJavascrpt {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement button= driver.findElement(By.id("modal-button"));
        button.click();
        WebElement closeButton=driver.findElement(By.id("close-button"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",closeButton);
        Thread.sleep(1000);
        driver.quit();
    }
}
