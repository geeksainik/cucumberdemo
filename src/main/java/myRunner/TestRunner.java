package myRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"E:\\myworkspace_selenium\\BDDCucumbeDemo\\src\\main\\java\\features"}, //the path of the feature files
		
		glue={"stepDefinitions"},//path of step definition file
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=false,
		dryRun=false)
      
public class TestRunner {
	
	
}
