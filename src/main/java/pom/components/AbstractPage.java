package pom.components;

import util.driver.WebDriverFactory;
import util.driver.WebDriverUtils;

public abstract class AbstractPage {

    private String pageUrl;

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String currentPageUrl() {
        return WebDriverUtils.currentPageUrl();
    }

    public void visitPage() {
        WebDriverFactory.getDriver().get(pageUrl);
    }
}
