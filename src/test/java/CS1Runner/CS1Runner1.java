package CS1Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\training_h2a.06.17\\Desktop\\Eclipse\\eclipse\\Eclipse Documents\\cucjenkins23\\cucjenkins23\\features\\logintest.feature",
		glue= {"stepDefs"},
		plugin= {"pretty","html:target/report1012"}
		
		
)

public class CS1Runner1 
{

}
