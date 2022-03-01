package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
		  
		  driver.manage().window().maximize();
		  driver.get("http://naukri.com/");
		  Thread.sleep(8000);//delay of 8 sec or wait for 8 sec
		  
		  driver.quit();// close the parent browser and child browsert
}
}