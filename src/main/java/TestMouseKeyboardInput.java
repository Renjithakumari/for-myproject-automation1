import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestMouseKeyboardInput {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name=driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Renjitha");
        name.submit();
        WebElement button=driver.findElement(By.id("button"));
        button.click();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Asset Marque,E112,Kadugodi");
        WebElement street_number=driver.findElement(By.id("street_number"));
        street_number.sendKeys("Kannamamgala");
        WebElement route=driver.findElement(By.id("route"));
        route.sendKeys("Hoskote Road");
        WebElement locality=driver.findElement(By.id("locality"));
        locality.sendKeys("Bangalure");

        WebElement postal_code=driver.findElement(By.id("postal_code"));
        postal_code.sendKeys("560067");
        WebElement country=driver.findElement(By.className("form-control"));
        country.sendKeys("India");
        Thread.sleep(1000);
        driver.quit();

    }

}
