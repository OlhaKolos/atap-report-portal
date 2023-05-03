package pom.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.driver.WebDriverFactory;
import util.driver.WebDriverWaiter;

import static util.constants.Constants.DEFAULT_POLLING_MILLS;
import static util.constants.Constants.DEFAULT_WEBELEMENT_TIMEOUT;
import static util.driver.WebDriverUtils.waitFor;

public abstract class AbstractFragment extends WebDriverWaiter {

    private WebElement rootElement;

    public WebElement getRootElement() {
        return rootElement;
    }

    public void setRootElement(By rootElement) {
        this.rootElement = WebDriverFactory.getDriver().findElement(rootElement);
    }

    public void setChildInputValue(By locator, String value) {
        WebElement input = getChildElement(locator);
        input.click();
        input.clear();
        input.sendKeys(value);
    }

    public void clickChildElement(By locator) {
        waitForElement(locator);
        getChildElement(locator).click();
    }

    public void waitForChildHidden(By locator) {
        waitFor(condition -> !getRootElement().findElement(
                locator).isDisplayed(), DEFAULT_WEBELEMENT_TIMEOUT, DEFAULT_POLLING_MILLS);
    }

    private WebElement getChildElement(By locator) {
        return getRootElement().findElement(locator);
    }

    protected WebElement root() {
        return rootElement;
    }
}
