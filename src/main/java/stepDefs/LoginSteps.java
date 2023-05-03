package stepDefs;

import pom.fragments.LoginFormFragment;

import static util.constants.Constants.DEMO_USER_EMAIL;
import static util.constants.Constants.DEMO_USER_PASSWORD;

public class LoginSteps {
    private LoginFormFragment loginFormFragment = new LoginFormFragment();

    public void loginAsDemoUser() {
        loginFormFragment.loginAsRegisteredUser(DEMO_USER_EMAIL, DEMO_USER_PASSWORD);
    }
}
