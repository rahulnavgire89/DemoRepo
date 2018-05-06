package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Rahul\\Desktop\\New folder\\DemoGit\\src\\main\\java\\Features\\First.feature"
				,glue= {"StepDefination"},dryRun= true,format= {"pretty","html:test-Output"	})
public class TestRunner {
	
	
	
}
