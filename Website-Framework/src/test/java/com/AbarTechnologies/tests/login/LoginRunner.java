package com.AbarTechnologies.tests.login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/AbarTechnologies/tests/login",
        glue = {"com.AbarTechnologies.tests"},
        plugin = {"html:reports/Login-Report.html"},
        monochrome = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}
