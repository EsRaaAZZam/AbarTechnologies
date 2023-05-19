package com.AbarTechnologies.tests;

import com.AbarTechnologies.browser.Browser;
import com.AbarTechnologies.driver.WebDriverHandler;

public class BaseTest {
    protected static Browser browser;


    protected WebDriverHandler webDriverHandler;

    protected static String removeCharsExceptForDigitsAndDots(String string) {
        return string.replaceAll("[^0-9.]", "");
    }
}
