package com.AbarTechnologies;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/AbarTechnologies/tests",
        glue = {"com.AbarTechnologies.tests"},
        plugin = {"html:reports/Consumer-Website-Report.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
