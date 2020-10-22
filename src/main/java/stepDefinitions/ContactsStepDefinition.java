package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsStepDefinition extends TestBase {
	

@Given("^user logged into free CRM application with loggeduser$")
public void user_logged_into_free_CRM_application_with_loggeduser(DataTable userData)  {
	
	String actualTitle = driver.getTitle();
	
	System.out.println(actualTitle);
	
	Assert.assertEquals("Cogmento CRM", actualTitle);
	
	for(Map<String, String> udata : userData.asMaps(String.class, String.class))
	{
	driver.findElement(By.name("email")).sendKeys(udata.get("username"));
	driver.findElement(By.name("password")).sendKeys(udata.get("password"));
	
	driver.findElement(By.xpath("//div[@class ='ui fluid large blue submit button']")).click();
	String acutalUser= driver.findElement(By.xpath("//span[@class = 'user-display']")).getText();
	Assert.assertEquals(udata.get("loggeduser"), acutalUser);
	}

}

@When("^user click on contacts and new$")
public void user_click_on_contacts_and_new()
{
	driver.findElement(By.xpath("//a[@class = 'item' and @href ='/contacts']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
}
	

@Then("^enter contact details$")
public void enter_contact_details(DataTable contactDetails) throws Exception  {
	for(Map<String, String> data : contactDetails.asMaps(String.class, String.class))
	{
		driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys(data.get("firstname"));
		driver.findElement(By.xpath("//input[@name = 'last_name']")).sendKeys(data.get("lastname"));
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class = 'item' and @href ='/contacts']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	}

}




}
