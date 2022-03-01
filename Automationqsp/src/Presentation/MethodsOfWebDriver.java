package Presentation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://naukri.com/");
		driver.manage().window().maximize();
		String getTheTitleofThePage= driver.getTitle();
		System.out.println(getTheTitleofThePage);
		String getCurrentUrlofThePAge= driver.getCurrentUrl();
		System.out.println(getCurrentUrlofThePAge);
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.switchTo().activeElement().sendKeys("Qspider",Keys.ENTER);
		String getPageSource= driver.getPageSource();
		System.out.println(getPageSource);
		driver.quit();
		driver.close();
		
		
		
		
		
	}

}
