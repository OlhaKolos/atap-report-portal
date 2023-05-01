package util.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    private static ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {
        WebDriver driver = WebDriverFactory.driverSelector();
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
        driver.manage().window().maximize();
        return driver;
    });

    private static WebDriver driverSelector() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--no-sandbox");
        return new ChromeDriver(chromeOptions);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
