package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
		,plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
//		,plugin ={"pretty", "html:target/cucumber"}
//		,plugin ={"pretty", "json:target/cucumber.json"}
		)
 
public class TestRunner {
 
}