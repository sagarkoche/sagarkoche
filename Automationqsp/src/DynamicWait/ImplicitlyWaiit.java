package DynamicWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaiit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
	
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		
		driver.findElement(By.xpath("//input[@id='employeeId']")).clear();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sagar");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("vinod");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("koche");
		driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='photofile']")).click();
	    driver.close();
	}

}
