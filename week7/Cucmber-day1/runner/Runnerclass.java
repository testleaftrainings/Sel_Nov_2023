package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/feature",
					glue="stepdef",monochrome=true,publish=true)
public class Runnerclass extends AbstractTestNGCucumberTests{

}

//For execution
      //use existing class and cucumber annotation
//cucumberOptions ->attributes
//features-->path of the feature file should be set
//glue-->to map with stepdef -->packagename of stepdefinition