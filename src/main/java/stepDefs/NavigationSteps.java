package stepDefs;

import pom.pages.LoginPage;

public class NavigationSteps {

    private LoginPage loginPage = new LoginPage();

    public void navigateToLoginPage() {
        loginPage.visitPage();
    }
}
