package runner2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SHIVAM SINGH\\eclipse-workspace\\AmazonApp\\src\\test\\java\\features2\\amazon.feature",
   				 glue= {"steps2"},
				dryRun=false,
				plugin={"pretty",
						"html:target/cucumberreport.html"}
			
				
		
		
		
		)


public class TestRunner2 {

	
}
