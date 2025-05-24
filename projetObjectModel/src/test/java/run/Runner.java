package run;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Register" ,
		glue = {"stepDefinition","hooks"},
		features = "src/test/features/testCasesAutomationExercices" ,
		publish = true ,
		plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-reportJson","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class Runner {

}
