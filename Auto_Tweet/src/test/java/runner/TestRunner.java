package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"step_definitions"}, tags = "@All", dryRun = false, plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}, monochrome = true)

public class TestRunner {

}