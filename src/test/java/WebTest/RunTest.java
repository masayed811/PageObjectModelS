package WebTest;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =".", tags = "@currency", format = {"pretty","html:target/cucumber-report"})

public class RunTest {
}
