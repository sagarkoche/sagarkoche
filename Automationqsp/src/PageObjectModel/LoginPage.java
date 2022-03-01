package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Declaration
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(name="loginButton") private WebElement loginBtn;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	
	


	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	//utilization
	    
public WebElement getUsn() {
	return usn;
}

public WebElement getPsw() {
	return psw;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
public WebElement getLogo() {
	return logo;
}
public WebElement getKeepLoggedInCheckBox() {
	return keepLoggedInCheckBox;
	
}

//Operational Method

//public void sendUsername()
//{
//	usn.sendKeys("admin");
//}
//public void sendPassword()
//{
//	psw.sendKeys("manager");
//}
//public void clickOnLoginButton()
//{
//	loginBtn.click();
//}
public void delayOfTwoSeconds() throws InterruptedException
{
	Thread.sleep(2000);
}


//generic reusable method
 public void validLogin(String validUsername, String validPassword)
 {
	 usn.sendKeys(validUsername);
	 psw.sendKeys(validPassword);
	 loginBtn.click();
 }
 
 public void invalidLogin(String invalidUsername, String invalidPassword) throws InterruptedException
 {
	 usn.sendKeys(invalidUsername);
	 Thread.sleep(2000);
	 psw.sendKeys(invalidPassword);
	 Thread.sleep(2000);
	 loginBtn.click();
	 Thread.sleep(2000);
	 usn.clear();
 }
}

