package MethodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//open browser

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		Dimension size = searchBox.getSize();
		int width=size.getWidth();
	    int height=	size.getHeight();
	    System.out.println(height);
		System.out.println(width);
		
		
	}

}
