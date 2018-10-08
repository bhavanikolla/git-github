package stepDefn;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AttitudeTest {
	
	@Before()
	public void beforeScenarioMethod()
	{
		System.out.println("method is executed before the scenario begins");
	}
	
	@When("^I meet ([^\"]*)$")
	public void iMeet(String str)
	{
		if (str.equals("watchman"))
		{
			System.out.println("selenium automation code for watchman");
		}
		
		if(str.equals("newspaperboy"))
		{
			System.out.println("selenium automation code for newspaperboy");
		}
		
	}
	
	@Given("^I work in ([^\"]*)$")
	public void iWork(String str)
	{
		if(str.equals("latenights"))
		{
			System.out.println("selenium automation code for latenights. ");
		}
		
		if(str.equals("mornings"))
		{
			System.out.println("selenium automation code for mornings");
		}
	}
	
	@Then("^I ([^\"]*) him$")
	public void greet(String str)
	{
		if(str.equals("greeted"))
		{
			System.out.println("automation code for greeting");
		}
		
		if(str.equals("skipgreeting"))
		{
			System.out.println("automation code for not greeting");
		}
	}
	
	@Given("^we work in \"([^\"]*)\"$")
	public void we_work_in(String s)
	{
		System.out.println("automation code for "+ s);
	}
	
	@When("^I meet \"([^\"]*)\"$")
	public void i_meet(String str)
	{
		System.out.println("automation code for "+ str);
	}
	
	@After()
	public void afterScenarioMethod()
	{
		System.out.println("method is executed after teh scenario ends");
	}

	
}
