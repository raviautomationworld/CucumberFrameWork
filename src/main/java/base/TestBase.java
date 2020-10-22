package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
	
		prop = new Properties();
		try {
			FileInputStream file= new FileInputStream("E:\\SeleniumTeaching\\CodeDemo\\CucumberFrameWork\\src\\main\\java\\config\\config.properties");
			prop.load(file);
			

		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	public static void intilization() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTeaching\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}

}
