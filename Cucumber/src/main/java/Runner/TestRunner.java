package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\12023\\eclipse-workspace\\Cucumber\\src\\test\\java\\Features\\AirbnbSignup.feature",
		strict = false, //check if any step is not defined in step definition file
		dryRun= false)//check the mapping is proper between feature file and step def file

public class TestRunner {

}
