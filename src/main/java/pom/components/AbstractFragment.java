package pom.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.driver.WebDriverFactory;
import util.driver.WebDriverWaiter;

public abstract class AbstractFragment extends WebDriverWaiter {

    private WebElement rootElement;

    public WebElement getRootElement() {
        return rootElement;
    }

    public void setRootElement(By rootElement) {
        this.rootElement = WebDriverFactory.getDriver().findElement(rootElement);
    }

    public void setChildInputValue(By locator, String value) {
        getChildElement(locator).sendKeys(value);
    }

    public void clickChildElement(By locator) {
        waitForElement(locator);
        getChildElement(locator).click();
    }

    private WebElement getChildElement(By locator) {
        return getRootElement().findElement(locator);
    }
}
