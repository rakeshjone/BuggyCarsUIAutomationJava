package Runner;

import io.cucumber.core.backend.StepDefinition;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"StepDefinitions"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
