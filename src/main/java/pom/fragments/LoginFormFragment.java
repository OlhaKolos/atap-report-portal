package pom.fragments;

import org.openqa.selenium.By;
import pom.components.AbstractFragment;

import static org.openqa.selenium.By.xpath;

public class LoginFormFragment extends AbstractFragment {
    public static final By ROOT = xpath("//form[contains(.,'Login')]");

    public static final By EMAIL_FIELD = xpath(".//input[@name = 'login']");
    public static final By PASSWORD_FIELD = xpath(".//input[@name = 'password']");
    public static final By LOGIN_BUTTON = xpath(".//button[@type='submit']");


    public LoginFormFragment() {
        setRootElement(ROOT);
    }

    public void setUserEmail(String userEmail) {
        setChildInputValue(EMAIL_FIELD, userEmail);
    }

    public void setUserPassword(String userPassword) {
        setChildInputValue(PASSWORD_FIELD, userPassword);
    }

    public void clickLoginButton() {
        clickChildElement(LOGIN_BUTTON);
    }

    public void loginAsRegisteredUser(String email, String password) {
        setUserEmail(email);
        setUserPassword(password);
        clickLoginButton();
    }
}
