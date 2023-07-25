package uk.co.library.cv.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/resources/featurefile/register.feature",
        glue = "uk/co/library/cv/cucumber",
        tags = " @regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class RegressionRunner {


}
