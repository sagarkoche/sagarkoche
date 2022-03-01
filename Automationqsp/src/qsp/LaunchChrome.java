package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ChromeDriver();
	}

}
