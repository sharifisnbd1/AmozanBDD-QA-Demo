package Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
		
		
		features= {"com.USP_Signin\\src\\test\\java\\Feature\\ups.feature"},
		glue= {"com.USP_Signin\\src\\test\\java\\StepDefinitions\\UPS_sd.java"},
				
		tags= {"@smoke"},
		
			monochrome=true,
				strict=true)
			
@Test
public class Amazon_Runner  extends AbstractTestNGCucumberTests {
	
			

}
