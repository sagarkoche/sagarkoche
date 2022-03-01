package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfermationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sagar/Downloads/Confirmation.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Alert al = driver.switchTo().alert();
		
		String textIOfAlertPopup = al.getText();
		System.out.println(textIOfAlertPopup);
		al.dismiss();//hit cancel button
	}

}
