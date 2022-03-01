package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActitimeLogin {
	 WebDriver driver;
	@Test

	public void openBrowser(String browserValue,String username, String password)
	{
		
		 if (browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("http://desktop-psk2aam:8080/login.do");
			 driver.findElement(By.name("username")).sendKeys(username);

				driver.findElement(By.name("pwd")).sendKeys(password);

				driver.findElement(By.id("loginButton")).click();
			
		} 
		else if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("http://127.0.0.1/login.do");
			
			 driver.findElement(By.name("username")).sendKeys(username);

				driver.findElement(By.name("pwd")).sendKeys(password);

				driver.findElement(By.id("loginButton")).click();
		}
		
		
		else 
		{
			System.out.println("Invalid Option");
		}
		 
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}