package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://skillrary.com/user/login");
		 
		  driver.findElement(By.name("email")).sendKeys("885555555");
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys("54452211");
		  Thread.sleep(3000);
		  // Inspect not perform on submit button
		  driver.close();
	}

}
