package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		driver.findElement(By.cssSelector("input[id^='txtU']")).sendKeys("jghhfhg");
		driver.findElement(By.cssSelector("input[id^='txtT']")).sendKeys("hbbhjj");
		driver.findElement(By.cssSelector("a[id$='Btn']")).click();
	}

}
