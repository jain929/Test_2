package test_runner_package;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Test_1_feature"
		,glue= {"step_defination_test"}
		)
public class Test_runner_class {

}
