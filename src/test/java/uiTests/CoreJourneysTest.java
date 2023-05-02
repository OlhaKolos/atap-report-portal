package uiTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import runner.TestRunner;
import stepDefs.LoginSteps;
import stepDefs.NavigationSteps;

@RunWith(TestRunner.class)
public class CoreJourneysTest {

    NavigationSteps navigationSteps = new NavigationSteps();

    @Test
    @DisplayName("Login to the Report Portal")
    void loginToTheReportPortal() {
        navigationSteps.navigateToLoginPage();
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.loginAsDemoUser();
        Assertions.assertTrue(navigationSteps.isCurrentPageSettingPage());
    }
}
