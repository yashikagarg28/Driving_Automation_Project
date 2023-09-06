package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\CucumberFramework\\src\\test\\java\\Features\\login.feature","C:\\Users\\yashika.garg\\eclipse-workspace\\Selenium\\TestING\\CucumberFramework\\src\\test\\java\\Features\\Schedule.feature"},
		glue={"stepDefinations"},
		tags= ("@Login or @Schedule")
		)

	
public class TestRunner
{
		
}