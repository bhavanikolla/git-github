/*package stepDefn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class YahooLoginTest_StepDefn1 {
	
	WebDriver driver = null;
	@Given("^user opens gmail page$")
	public void user_opens_gmail_home_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BHAVANI\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
	}
	
	@Then("^user enters email id$")
	public void enter_username(DataTable credential)
	{  
		List<List<String>> data =  credential.raw();
		driver.findElement(By.id("identifierId")).sendKeys(data.get(0).get(0));
	}
	
	@Then("^user clicks next$")
	public void click_next()
	{
		driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
	}
	
	@And("^user enters password$")
	public void enter_password(DataTable credential)
	{     List<List<String>> data =   credential.raw();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(0));
	}
	
	@And("^user then clicks on the next button$")
	public void click_nextbutton_after_password()
	{
		driver.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
	}
	
	@And("^user closes the browser$")
	public void close_browser()
	{
		driver.quit();
	}

}
*/