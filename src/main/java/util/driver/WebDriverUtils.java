package util.driver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofMillis;
import static util.driver.WebDriverFactory.getDriver;

public class WebDriverUtils {

    public static String currentPageUrl() {
        return getDriver().getCurrentUrl();
    }

    public static <T> void waitFor(ExpectedCondition<T> userCondition, long milliseconds, long pollingTimeMilliseconds) {
        newWebDriverWait(milliseconds).pollingEvery(ofMillis(pollingTimeMilliseconds))
                .until(userCondition);
    }

    private static WebDriverWait newWebDriverWait(long milliseconds) {
        return new WebDriverWait(getDriver(), ofMillis(milliseconds));
    }
}
