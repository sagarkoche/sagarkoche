package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		 Dimension targetSize = new Dimension(500,700);
		 driver.manage().window().setSize(targetSize);
		 
		 driver.close();
	}

}
