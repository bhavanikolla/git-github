package stepDefn1;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefnFileTags {
	
	
	@Before
	public void beforeMethod()
	{
		System.out.println("method executed once before each scenario");
	}
	
	@Given("^user enters google url$")
	public void method1()
	{
		
	}

	
	@Given("^user enters search text$")
	public void method2()
	{
		
	}

	
	@Given("^user enters search button$")
	public void method3()
	{
		
	}

	
	@Given("^user sees the result page$")
	public void method4()
	{
		
	}

	
	@Given("^user then clicks on the answer links he wants to$")
	public void method5()
	{
		
	}

	
	@Given("^user then clicks on the image link$")
	public void method6()
	{
		
	}

	
	@Given("^images window is opened$")
	public void method7()
	{
		
	}

	
	@Given("^user then clicks on the image that he wants$")
	public void method8()
	{
		
	}

	
	@Given("^user goes to the window opened from clicking image$")
	public void method9()
	{
		
	}

	
	@Given("^user clicks on the image window link to know more about that image$")
	public void method10()
	{
		
	}

	
	@Given("^user reads everything about the image$")
	public void method11()
	{
		
	}

	
	@Given("^user clicks on an other image or goes to the text search results window$")
	public void method12()
	{
		
	}


	
	@Given("^user then clicks on an other link or closes the browser$")
	public void method13()
	{
		
	}

	
	@After
	public void afterMethod()
	{
		System.out.println("executed once after each scenario");
	}

}
