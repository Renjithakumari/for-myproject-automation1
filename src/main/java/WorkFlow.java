import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConformationOfPage;
import pages.FormPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkFlow {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage1=new FormPage();
        formPage1.submitForm(driver);
        ConformationOfPage conformationOfPage=new ConformationOfPage();
        ConformationOfPage.waitAlertBanner(driver);
        assertEquals ("The form was successfully submitted!",conformationOfPage.getAlerBannerText(driver));
        Thread.sleep(1000);
        driver.quit();
    }


}
