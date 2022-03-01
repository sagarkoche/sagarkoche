package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		WebDriver driver= new ChromeDriver(co);
		co.addArguments("--disable-notifications");
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
			driver.manage().window().maximize();
			
		
	}

}
