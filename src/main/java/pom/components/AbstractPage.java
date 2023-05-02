package pom.components;

import util.driver.WebDriverFactory;

public abstract class AbstractPage {

    private String pageUrl;

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void visitPage() {
        WebDriverFactory.getDriver().get(pageUrl);
    }

    public boolean isCurrent(String pageUrl) {
        return new PageChecker(this).isCurrentByUrl(pageUrl);
    }
}
