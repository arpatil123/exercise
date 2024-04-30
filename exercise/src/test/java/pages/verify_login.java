package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseclass;

	public class verify_login extends baseclass {
		 WebDriver driver;
			public verify_login(WebDriver driver) 
			{
		      
				PageFactory.initElements(driver, this);
			}
				
			
		     @FindBy(xpath="//form[@action='/login']/input[2]")
		      WebElement mail;
		     @FindBy(xpath="//form[@action='/login']/input[3]")
		      WebElement pass1;
		     @FindBy(xpath="//button[text()='Login']")
		      WebElement btn;
		     
		     public void verifymail( String newname)
		     {
		    	 
		    	 mail.sendKeys(newname);
		    	 
		     }

		     public void verifypass(String newemail)
		     {
		    	 
		    	 pass1.sendKeys(newemail);
		    	 
		     }

		     
		     public void submit()
		     {
		    	 
		    	 btn.click();
		    	 
		     }
		    

	}



