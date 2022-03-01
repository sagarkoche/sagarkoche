package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  driver.get("https://www.orangehrm.com/");
		   Thread.sleep(8000);//delay of 8 sec or wait for 8 sec
		   String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl); 
		  driver.quit();// used to close parent and child browser
	}

}
