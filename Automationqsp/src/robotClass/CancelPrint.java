package robotClass;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelPrint {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Robot robot= new Robot();
	//	robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		
		//hit on cancel
		
		for(int i=0;i<5;i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

		
	}

}
