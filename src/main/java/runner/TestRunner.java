package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="E:\\SeleniumTeaching\\CodeDemo\\CucumberFrameWork\\src\\main\\java\\features\\Tables.feature"
,glue={"stepDefinitions"},
format= {"pretty",
		"html:target/test-output",
		"json:target/json_output/cucumber_tests.json",
		"junit:target/junit_xml/cucumber.xml",
		"rerun:target/rerun.txt"},
monochrome = true,
strict = true,
dryRun = false,
tags= {"@VerifyText"}

)

public class TestRunner {
	

	

}
