package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.create_acc;
import pages.homepage;
import pages.login;
import pages.product_page;
import pages.successfully_create;
import pages.verify_login;
import utilities.baseclass;

public class logintestscript extends baseclass
{
	
	@Test
	public void new_registered()
	{
	 
	
		
		homepage hp=new homepage(driver);
		hp.clicksignin();
	
		login lg=new login(driver);
		lg.name("ashwini");
		lg.mailadd("arpatilp4575@gmail.com");

		lg.clicksignin();
		
		create_acc account=new create_acc(driver);
		
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
		
		successfully_create sc =new successfully_create(driver);
		
		sc.confirm();
		sc.continuebtn();
	
		
		
	  	product_page itemname=new product_page(driver);
	     itemname.clickproduct();
	
		
		}
		
		@Test
		
		public void verify_alreadylogin()
		{
			homepage hp2=new homepage(driver);
			hp2.clicksignin();
		
			verify_login ss=new verify_login(driver);

			ss.verifymail("arpatilh131952@gmail.com");

			ss.verifypass("ashwini@12344");
ss.submit();
successfully_create sc =new successfully_create(driver);

sc.confirm();
sc.continuebtn();
		}
	}
	

