import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement element=driver.findElement(By.name(("q")));
        element.sendKeys("reshmi");
        element.submit();
        driver.quit();
    }
}
