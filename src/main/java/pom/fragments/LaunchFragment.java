package pom.fragments;

import org.openqa.selenium.By;
import pom.components.AbstractFragment;

import static org.openqa.selenium.By.cssSelector;

public class LaunchFragment extends AbstractFragment {

    public static final By ROOT = cssSelector(".gridRow__grid-row-wrapper--1dI9K");
    public static final By LAUNCH_NAME = cssSelector(".itemInfo__main-info--2HB9g a div");

}
