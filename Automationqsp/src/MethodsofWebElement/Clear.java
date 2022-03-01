package MethodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("vinod");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("koche");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='photofile']")).click();
	    driver.close();
	}

}
