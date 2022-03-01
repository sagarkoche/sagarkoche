package HandlingTheDropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingTheDropdowns5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("file:///E:/dropdown/MultiSelectDropdown.html");
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		
	   //Multiple option selection
		
		for(int i=0;i<=5;i++)
		{
			sel.selectByIndex(i);
		}
		sel.deselectAll();
		}
	}


