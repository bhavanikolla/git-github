package stepDefn1;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:\\Users\\Mahathi\\eclipse-workspace\\CucumberTutorial\\src\\stepDefn1\\yahootest3.feature",
format = {"pretty","html:report","json:report\\cucumber.json","junit:report\\cucumber1.xml"},tags= {"@SmokeTest"} ,

dryRun = false,  monochrome = true, strict = true)


public class TestRunner3 {

}


//tags={"@SmokeTest, @End2End"} execute test cases with tags @SmokeTest OR @End2End
//tags={"@SmokeTest","@End2End"} execute test cases with tags @SmokeTest AND @End2End