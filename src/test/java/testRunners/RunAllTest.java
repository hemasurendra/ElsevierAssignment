package testRunners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Siva on 1/15/2019.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/createAccount/", glue = "stepDefinitions",tags = {"@Automation"})

public class RunAllTest {
}
