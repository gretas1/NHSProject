package com.test.NHS.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",//content
        glue = "com/test/NHS/stepdefinitions",//source
        dryRun = true,
        tags = "@regression",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

)
public class Runner {
}


