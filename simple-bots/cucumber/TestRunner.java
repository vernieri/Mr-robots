package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "features",
		glue = {"stepDefination"},
		plugin ={"html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
			 "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"}
		)
public class TestRunner {
	

}
