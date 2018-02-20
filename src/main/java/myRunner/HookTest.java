package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"E:\\myworkspace_selenium\\BDDCucumbeDemo\\src\\main\\java\\features\\hooks.feature"}, //the path of the feature files
		
		glue={"stepDefinitions"},//path of step definition file
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=false,
		dryRun=false
		//tags= {"@featuretag"}
		)
      



public class HookTest {
	
	

}
