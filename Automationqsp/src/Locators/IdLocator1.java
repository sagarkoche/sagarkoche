package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("email")).sendKeys("admin");
		  Thread.sleep(3000);
		  driver.findElement(By.id("pass")).sendKeys("admin123");
		  driver.findElement(By.id("loginbutton")).click();
		 // driver.close();

	}

}
