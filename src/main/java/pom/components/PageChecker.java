package pom.components;

import util.driver.WebDriverUtils;

public class PageChecker {
    private String currentUrl;
    private AbstractPage sitePage;

    public PageChecker(AbstractPage sitePage) {
        this.sitePage = sitePage;
    }

    protected boolean isCurrentByUrl(String expectedUrl) {
        currentUrl = WebDriverUtils.currentPageUrl();
            return currentUrl.contains(expectedUrl);
    }
}
