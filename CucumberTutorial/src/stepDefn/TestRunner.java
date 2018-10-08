package stepDefn;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:\\Users\\Mahathi\\eclipse-workspace\\CucumberTutorial\\src\\stepDefn\\dailyRoutine.feature",
format = {"pretty","html:report","json:report\\cucumber.json","junit:report\\cucumber1.xml"}, 
dryRun=false, glue = {"stepDefn"}, monochrome = true, strict = true)

public class TestRunner {

}
