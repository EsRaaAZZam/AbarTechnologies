package com.AbarTechnologies.driver;

import com.AbarTechnologies.utilities.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.IOException;

public class WebDriverHandler {

    private static final String chromeDriverPath = "../driverBinaries/chromedriver.exe";
    private static final String edgeDriverPath = "../driverBinaries/msedgedriver.exe";
    private static final String safariDriverPath = "/usr/bin/safaridriver";
    private static final String chromeDriverType = "webdriver.chrome.driver";
    private static final String edgeDriverType = "webdriver.edge.driver";
    private static final String safariDriverType = "webdriver.safari.driver";
    private static final String browserType = "resources/config/configBrowser.properties";
    private static WebDriver webDriver;
    private String driverPath = "driverPath";

    public WebDriverHandler() throws IOException {
        getDriverType();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void close() {
        webDriver.quit();
    }

    private void getDriverType() throws IOException {
        ConfigProperties configBrowser = new ConfigProperties(browserType);
        driverPath = configBrowser.getProperty(driverPath);

        switch (driverPath) {
            case chromeDriverPath:
                System.setProperty(chromeDriverType, chromeDriverPath);

                ChromeOptions chromeCapabilities = new ChromeOptions();
                webDriver = new ChromeDriver(chromeCapabilities);
                webDriver.manage().window().maximize();
                break;

            case edgeDriverPath:
                System.setProperty(edgeDriverType, edgeDriverPath);

                EdgeOptions edgeCapabilities = new EdgeOptions();
                webDriver = new EdgeDriver(edgeCapabilities);
                System.setProperty("webdriver.edge.verboseLogging", "true");
                webDriver.manage().window().maximize();
                break;

            case safariDriverPath:
                System.setProperty(safariDriverType, safariDriverPath);

                SafariOptions safariCapabilities = new SafariOptions();
                webDriver = new SafariDriver(safariCapabilities);
                webDriver.manage().window().maximize();
                break;
        }

    }

    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }

    public void resetCache() {
        webDriver.manage().deleteAllCookies();
    }

    public String userGetCurrentUrl() {
        return webDriver.getCurrentUrl();
    }
}
