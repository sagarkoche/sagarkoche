package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  driver.get("https://www.orangehrm.com/");
		   String titleofLoginPage = driver.getTitle();
		  Thread.sleep(8000);//delay of 8 sec or wait for 8 sec
		  
		  System.out.println(titleofLoginPage); 
		  driver.quit();// used to close parent and child browser
	}

}
