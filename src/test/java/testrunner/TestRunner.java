package testrunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {"stepdefs"},

        tags = {"~@Ignore"}
)

public class TestRunner {
}
