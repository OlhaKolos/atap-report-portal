package stepDefs;

import pom.pages.LoginPage;
import pom.pages.SettingsPage;

import static util.constants.Urls.SETTING_PAGE;

public class NavigationSteps {

    private LoginPage loginPage = new LoginPage();
    private SettingsPage settingsPage = new SettingsPage();

    public void navigateToLoginPage() {
        loginPage.visitPage();
    }

    public boolean isCurrentPageSettingPage() {
        return settingsPage.isCurrent(SETTING_PAGE);
    }
}
