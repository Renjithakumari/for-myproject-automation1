import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dP=driver.findElement(By.id("datepicker"));
        dP.sendKeys("02/02/2020");
        dP.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        driver.quit();
            }
}
