package com.AbarTechnologies.tests;

import com.AbarTechnologies.browser.Browser;
import com.AbarTechnologies.driver.WebDriverHandler;
import com.AbarTechnologies.utilities.extent_report.ExtentReport;
import com.AbarTechnologies.utilities.image_reducer.ImageReducer;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before()
    public void setUpStcWebsite() throws IOException {
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        webDriverHandler.resetCache();
        webDriverHandler.navigateTo("https://subscribe.stctv.com/sa-ar?");
    }

    @Before(order = 1)
    public void startTCHooks(Scenario scenario) {
        ExtentReport.setScenario(scenario);
        ExtentReport.startTC();
    }


    @Before(order = 2)
    public void setStepDefs() throws NoSuchFieldException, IllegalAccessException {
        ExtentReport.setStepDefs();
    }

    @After()
    public void tearDown() {
        webDriverHandler.resetCache();
        WebDriverHandler.close();
    }

    @AfterStep
    public void AfterStep(Scenario scenario) throws IOException {
        String stepName = ExtentReport.getCurrentStepName();
        Status logStatus;

        if (scenario.isFailed())
            logStatus = Status.FAIL;
        else
            logStatus = Status.PASS;

        byte[] image = ((TakesScreenshot) WebDriverHandler.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        String base64Screenshot = ImageReducer.reduce(image, 800, 600);
        ExtentReport.getTest().log(logStatus, stepName, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
    }

    @After(order = 1)
    public void endTC() {
        if (ExtentReport.isCurrentlyUsingReport()) {
            ExtentReport.getExtent().flush();
        }
    }


}
