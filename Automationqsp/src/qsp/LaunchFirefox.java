package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	   Thread.sleep(8000);//delay of 8 sec or wait for 8 sec
	   
	

		
	}

}
