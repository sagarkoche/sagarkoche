package MethodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(5000);
		 WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		 boolean visibilityStatusofUsername = un.isDisplayed();
		 System.out.println(visibilityStatusofUsername+" username textbox is displayed");
		 
		 un.sendKeys("sagar");
		 
		 WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		 pwd.sendKeys("hbhbhbjhh");
		 WebElement loginBtn = driver.findElement(By.cssSelector("button[class*='L3NKy']"));
		 boolean statusOfLoginButton = loginBtn.isEnabled();
		 System.out.println(statusOfLoginButton);//true
			loginBtn.click();
		 

	}

}
