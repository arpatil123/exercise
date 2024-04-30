package tests;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.create_acc;
import pages.homepage;
import pages.login;
import pages.product_page;
import pages.successfully_create;
import pages.verify_login;
import utilities.Readexcelfile;
import utilities.baseclass;

public class logintestscriptdatadriven extends baseclass {

	@Test(enabled=false)
	public void new_registered() {

		homepage hp = new homepage(driver);
		hp.clicksignin();

		login lg = new login(driver);
		lg.name("ashwini");
		lg.mailadd("arpatil4575@gmail.com");

		lg.clicksignin();

		create_acc account = new create_acc(driver);

		account.clickgender();
		account.enterpass("ashwini@12340");
		account.enterfirstname("ashwini");
		account.enterlastname("patil");
		account.enteraddress("nigdi,pune");
		account.entercountry("India");
		account.enterstate("maharashtra");
		account.entercity("pune");
		account.enterzipcode("634365");
		account.entermob_no("6356353264");
		account.click();

		successfully_create sc = new successfully_create(driver);

		sc.confirm();
		sc.continuebtn();

		product_page itemname = new product_page(driver);
		itemname.clickproduct();

	}

	@Test(dataProvider = "LoginDataProvider")

	public void verify_alreadylogin(String useremail, String userpwd) throws InterruptedException
	{
	
		homepage hp2 = new homepage(driver);
		hp2.clicksignin();

		verify_login ss = new verify_login(driver);

		ss.verifymail(useremail);

		ss.verifypass("userpwd");
		ss.submit();
		successfully_create sc = new successfully_create(driver);

		sc.confirm();
		sc.continuebtn();
		sc.signout();
	}

	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider() {

		String filename = System.getProperty("C:\\Users\\LENOVO\\eclipse-workspace\\swagprj\\\\TestData\\automationdata.xlsx");

		int ttlRows = Readexcelfile.getRowCount(filename, "LoginTestData");

		int ttlColummns = Readexcelfile.getColCount(filename, "LoginTestData");

		String data[][] = new String[ttlRows][ttlColummns];

		for (int i = 1; i <ttlRows; i++) {
			for (int j = 0; j < ttlColummns; j++) {
				data[i - 1][j] = Readexcelfile.getCellValue(filename, "LoginTestData", i, j);
				System.out.println(data[i][j]);
			}
		}

		return data;

	}

}
