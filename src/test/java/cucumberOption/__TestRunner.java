package cucumberOption;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefination")
)

public class __TestRunner {
}
