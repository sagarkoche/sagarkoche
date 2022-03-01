package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithtoMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(8000);//delay of 8 sec or wait for 8 sec
		
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		driver.close();
		
	}

}
