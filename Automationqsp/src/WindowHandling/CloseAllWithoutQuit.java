package WindowHandling;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWithoutQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		String parentHandle = driver.getWindowHandle();
		String parentTitle = driver.getTitle();//omayo (QAFox.com)
		System.out.println(parentHandle);
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			
			driver.switchTo().window(wh).close();
		}
	}

}
