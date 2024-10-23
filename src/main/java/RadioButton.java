import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement rB1=driver.findElement(By.id("radio-button-1"));
        rB1.click();
        WebElement rB2=driver.findElement(By.cssSelector("input[value='option2']"));
        rB2.click();
        WebElement rb3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        rb3.click();

        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement cB1=driver.findElement(By.id("checkbox-1"));
        cB1.click();
        WebElement cB2=driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        cB2.click();
        WebElement cB3=driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        cB3.click();

        driver.quit();

    }
}
