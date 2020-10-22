package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;

import base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBase{
	
/*	@Before
	public void open_browser()
	{
		TestBase.intilization();
	}
	
	@After
	public void close_browser()
	{
		driver.quit();
	}*/
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		Assert.assertEquals("Cogmento CRM", actualTitle);
	
	}


	
	// Below method with simple data driven from feature file
	
	@When("^user enters username as \"(.*)\"$")
	public void user_enters_username(String username) {
		
		driver.findElement(By.name("email")).sendKeys(username);

	}

	
	// Below method with simple data driven from feature file
	
	/*
	 * Below are regular expression can be used for data driven in step definition file
	 * 1.  \"([^\"]*)\"
	 * 2.	\"(.*)\"
	 */
	
	@Then("^user enters password as \"(.*)\"$")
	public void user_enters_password(String password) {
		
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		driver.findElement(By.xpath("//div[@class ='ui fluid large blue submit button']")).click();

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){

		String acutalUser= driver.findElement(By.xpath("//span[@class = 'user-display']")).getText();
		
		Assert.assertEquals("Ravi Aluvala", acutalUser);
	}

	@Then("^verify invalid credential message is \"(.*)\"$")
	public void verify_invalid_credential_message(String expectedMessage){

		String actualMessage= driver.findElement(By.xpath("//div[@class='ui negative message']/p")).getText();
		
		Assert.assertEquals(expectedMessage, actualMessage);
	}

}
