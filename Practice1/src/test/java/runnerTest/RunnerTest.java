package runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Login1.feature", glue= {"stepDefinitions"},
plugin = {
         }
		)
public class RunnerTest {

}
