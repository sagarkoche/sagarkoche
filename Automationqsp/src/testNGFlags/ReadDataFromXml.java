package testNGFlags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXml {
	
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void openBrowser(String BrowserValue) {
	  
	  if(BrowserValue.equals("chrome"))
	  {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.google.com/");

	  }
	  else if(BrowserValue.equals("chrome"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/gecko.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.firefox.com/");
	  }
	  
	  else
	  {
		  System.out.println("read data");
		  
	  }
  }
}
