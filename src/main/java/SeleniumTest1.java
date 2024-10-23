import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1{
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        // Create an instance of WebDriver (for Chrome)
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        // Open a website
        System.out.println("Print1");
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}