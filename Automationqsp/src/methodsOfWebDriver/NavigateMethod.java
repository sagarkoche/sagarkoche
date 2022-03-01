package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");//used to launch the browser
		
		//Navigational commands
		driver.navigate().back();//come back previous page
		Thread.sleep(3000);
		driver.navigate().forward();//next page
		Thread.sleep(3000);
		driver.navigate().refresh();//refresh current page
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}

