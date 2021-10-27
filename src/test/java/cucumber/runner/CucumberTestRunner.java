package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true,
        tags = "",
        glue = "cucumber",
        features = "src/test/resources/features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
