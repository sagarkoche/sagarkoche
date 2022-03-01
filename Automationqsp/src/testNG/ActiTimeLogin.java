package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLogin {
	WebDriver driver;
	@Parameters({"username","password"})
  @Test
  public void openActitime(String username,String password) {
	  
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            driver.get("http://desktop-psk2aam:8080/login.do");
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    		
    		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
    		
    		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
            
	  
  }
}
