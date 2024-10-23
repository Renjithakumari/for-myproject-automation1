import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GmailLoginTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Gmail login page
            driver.get("https://stage47.elula-dev.com/wp-admin/plugins.php");
            //://stage47.elula-dev.com/wp-admin/plugins.php

            // Enter email address
            WebElement emailField = driver.findElement(By.id("user_login"));
            emailField.sendKeys("renjithakumari@elula.tech");
            WebElement nextButton = driver.findElement(By.id("user_pass"));
            nextButton.click();

            // Wait for password field to be present (you might need explicit wait)
            Thread.sleep(2000); // Better to use WebDriverWait in real scenarios

            // Enter password
            WebElement passwordField = driver.findElement(By.name("pwd"));
            passwordField.sendKeys("#Fqf9i(39!0<");
            WebElement passwordNextButton = driver.findElement(By.id("wp-submit"));
            passwordNextButton.click();
            Thread.sleep(10000);
            System.out.println("Login Success");


            WebElement table = driver.findElement(By.className("plugin-title column-primary"));
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            //To activate plugin
            WebElement activePlugin = driver.findElement(By.linkText("ELEX WooCommerce Catalog Feed for Facebook & Instagram"));//driver.findElement(By.id("activate-elex-woocommerce-catalog-feed-for-facebook-instagram"));
            System.out.println("activePlugin isEnabled "+activePlugin.isDisplayed());
            activePlugin.click();
            Thread.sleep(5000);
            //WebElement settingsElement = driver.findElement(By.linkText("Settings"));
            //System.out.println("isEnabled "+settingsElement.isDisplayed());
            //settingsElement.click();

           // WebElement abc=driver.findElement(By.xpath("//*[@id="the-list"]/tr[4]/td[1]/div/span[1]/a");
            Thread.sleep(5000);
//("a[href='https://example.com/target-page']"
                    //a[text()='Click Here']
                    //*[@id="the-list"]/tr[4]/td[1]/div/span[1]/a
                    ///html/body/div[1]/div[2]/div[2]/div[1]/div[3]/form[2]/table/tbody/tr[4]/td[1]/div/span[1]/a
            // Click on the link



            // Wait to see the result
            Thread.sleep(5000); // Adjust or use WebDriverWait

            // Verify login (you can use WebDriverWait or assertions in real scenarios)

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
