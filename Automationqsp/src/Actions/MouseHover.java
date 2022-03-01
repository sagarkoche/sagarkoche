package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.xpath("//a[.='Rings ']")).click();
		driver.findElement(By.xpath("//a[text()='Diamond' and @title='Diamond Rings']")).click();
	}

}
