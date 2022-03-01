package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Table",Keys.ENTER);
		WebElement target= driver.findElement(By.className("withsubtext"));
		Actions act= new Actions(driver);
		act.doubleClick(target).perform();
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
	}	
}