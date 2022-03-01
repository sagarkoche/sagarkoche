package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://demo.actitime.com/login.do");
		  driver.findElement(By.name("username")).sendKeys("admin");
		  Thread.sleep(3000);
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(3000);
		  driver.close();
	}

}
