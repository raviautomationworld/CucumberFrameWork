package stepDefinitions;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class TablesStepDefinition {
	
	WebDriver driver;
	
	@Before
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTeaching\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void close_browser()
	{
		driver.quit();
	}
	
	@Given("^navigated to w3school url$")
	public void navigateURL()
	{
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	@Then("^verify \"(.*)\" text from example table$")
	public void verifyText(String s)
	{
		Map<String,String> map = new HashMap<String,String>();
	int rows =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	int cols =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
	

	
	System.out.println(rows);
	System.out.println(cols);
	
	for(int i =2;i<=rows;i++)
	{
		String company = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();

		String country = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();

		map.put(company, country);
	}
	
	Set<String> keys = map.keySet();
	
	for(String r: keys)		
	{
		if(r.contains(s))
		{
			System.out.println(map.get(r));
		}
	}

	}
	
	

}
