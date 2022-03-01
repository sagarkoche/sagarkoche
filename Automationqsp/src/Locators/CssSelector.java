package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(8000);//delay of 8 sec or wait for 8 sec
		driver.findElement(By.name("username")).sendKeys("9960942139");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("hfgfgfg");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		
		
		driver.close();	

	}

}
