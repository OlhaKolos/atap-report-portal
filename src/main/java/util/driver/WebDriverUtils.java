package util.driver;

import static util.driver.WebDriverFactory.getDriver;

public class WebDriverUtils {

    public static String currentPageUrl() {
        return getDriver().getCurrentUrl();
    }
}
