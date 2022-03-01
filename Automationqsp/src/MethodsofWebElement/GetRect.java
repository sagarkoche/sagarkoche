package MethodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		Rectangle rect = searchBox.getRect();
		int width=rect.getWidth();
	    int height=	rect.getHeight();
	    System.out.println(width+ " pxl is the width of webelemnt");
		System.out.println(height+" pxl is the height of webelement");
		
		
	}

}
