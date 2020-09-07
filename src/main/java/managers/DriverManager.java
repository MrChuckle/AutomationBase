package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver getDriver() {
        WebDriver driver = null;

        switch("chrome"/*ConfigManager.properties.getProperty("browserName")*/) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }
}
