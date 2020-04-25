package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "steps",
        plugin = "pretty",
        tags = {"@Regression"}
)

public class runTest extends AbstractTestNGCucumberTests {
}
