package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='MI']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("5000");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("20000");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@id='a-autoid-1']")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}
