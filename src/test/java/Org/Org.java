package Org;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Org {
    WebDriver driver;

    @Test(groups = "regression")
    public void orgTest() {
        String browser = System.getProperty("browser", "chrome"); // Default to Chrome
        System.out.println("Browser: " + browser);
        System.out.println("Regression testing");
        System.out.println("Holkar");

        // Launch browser based on the system property
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser specified: " + browser);
            return; // Exit if invalid browser
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.flipkart.com");
    }

    @Test(groups = "smoke")
    public void createorgTest() {
        String browser = System.getProperty("browser", "chrome");
        System.out.println("Browser: " + browser);
        System.out.println("Smoke testing");
    }
}
