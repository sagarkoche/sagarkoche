package PageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		 BaseTest bt = new BaseTest();
		 bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		  Flib flib = new Flib();
		  String validUsername = flib.readPropertyData(PROP_PATH,"un");
		  String validPassword = flib.readPropertyData(PROP_PATH, "pass");
		  lp.validLogin(validUsername, validPassword);
		  bt.closeBrowser();
		  
		
		
		
	}

}
