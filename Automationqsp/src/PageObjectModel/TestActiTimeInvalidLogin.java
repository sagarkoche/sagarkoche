package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.By;

import DataDrivenFramework.Flib;

public class TestActiTimeInvalidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt= new BaseTest();
		bt.openBrowser();
		LoginPage lp= new LoginPage(driver);
		Flib flib = new Flib();

		int rc = flib.getRowCount(EXCEL_PATH,"Invalidcreds");
		
		for(int i=1;i<rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH,"Invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH,"Invalidcreds", i, 1);
			lp.invalidLogin(invalidUsername, invalidPassword);
			

		}
		bt.closeBrowser();
		


	}

}
