package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("http://desktop-psk2aam:8080/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.linkText("Settings")).click();
		
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act= new Actions(driver);
		act.doubleClick(target).perform();
		

	}

}
