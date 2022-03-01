package ParallelExecutionClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class class2 {
	WebDriver driver;
  @Test
  public void Test2() {
	  driver.switchTo().activeElement().sendKeys("kkr");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
