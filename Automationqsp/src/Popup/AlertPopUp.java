package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();//open browser
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
		driver.manage().window().maximize();
		driver.get("file:///E:/popup/Alert.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='Try it']")).click();
	Alert al = driver.switchTo().alert();
	String textofAlertPopup= al.getText();
	System.out.println(textofAlertPopup);
	al.dismiss();//hit ok button
		

	}

}
