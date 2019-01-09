package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "features",
		glue = {"stepDefination"},
		plugin ={"html:target/cucumber-html-report"}
		)
public class TestRunner {
	

}
