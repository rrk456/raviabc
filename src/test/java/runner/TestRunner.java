package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/fb.html","pretty"},
                  features="src/test/java/features",
                 glue="stepdefinitions")
public class TestRunner {

}
