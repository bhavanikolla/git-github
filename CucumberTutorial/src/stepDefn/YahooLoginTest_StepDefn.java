package stepDefn;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class YahooLoginTest_StepDefn {
	WebDriver driver = null;
	
	@Before()
	public void beforeMethod1()
	{
		System.out.println("executed once before the begging of each scenario");
	}
	
	@Before("@Second")
	public void beforeSecondScenario()
	{
		System.out.println("method is executed before for second scenario only");
	}
	
	@After("@Second")
	public void afterSecondScenario()
	{
		System.out.println("method is executed after for second scenario only");
	}
	
	
	@Given("^user opens gmail page$")
	public void user_opens_gmail_home_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BHAVANI\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
	}
	
		
	@Then("^user enters email id \"([^\"]*)\"$")
	public void enter_username(String username)
	{
		driver.findElement(By.id("identifierId")).sendKeys(username);
	}
	
	
	@Then("^user clicks next$")
	public void click_next()
	{
		driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
	}
	
	@And("^user enters password \"([^\"]*)\"$")
	public void enter_password(String password)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	@And("^user clicks next button$")
	public void click_nextbutton_after_password()
	{
		driver.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
	}
	
	@And("^user closes the browser$")
	public void close_browser()
	{
		driver.quit();
	}
	
	@Given("^user opens gmail$")
	public void open_gmail()
	{
		System.setProperty("webdriver.chrome.driver","C:\\BHAVANI\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	@Then("^get the title of gmail page$")
	public void get_title()
	{
		String str = driver.getTitle();
		System.out.println("title is "+str);
		
	}
	
	@And("^close the browser$")
	public void close_browser2()
	{
		driver.quit();
	}
	
	
	@After()
	public void afterMethod1()
	{
		System.out.println("executed once after the end of each scenario");
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


