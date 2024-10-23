package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConformationOfPage {
    public static void waitAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20));
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    }
    public static String getAlerBannerText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }

}
