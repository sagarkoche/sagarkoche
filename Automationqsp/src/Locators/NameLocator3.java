package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.snapdeal.com/login");
		 
		  driver.findElement(By.name("username")).sendKeys("a@gmail.com");
		  Thread.sleep(3000);
		 
		  // Inspect not perform on submit button
		  driver.close();

	}

}
