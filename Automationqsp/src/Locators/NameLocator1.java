package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.name("email")).sendKeys("admin");
		  Thread.sleep(3000);
		  driver.findElement(By.name("pass")).sendKeys("admin123");
		  Thread.sleep(2000);
		  driver.findElement(By.name("login")).click();
		//  driver.close();
		  
	}

}
