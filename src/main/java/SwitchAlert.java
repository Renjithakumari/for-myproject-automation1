import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.drive","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alert=driver.findElement(By.id("alert-button"));
        alert.click();
        Alert arert2=driver.switchTo().alert();
        arert2.accept();
        driver.quit();
    }
}
