package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseclass;

public class login extends baseclass {
	 WebDriver driver;
		public login(WebDriver driver) 
		{
	      
			PageFactory.initElements(driver, this);
		}
			
		
	     @FindBy(xpath="//input[@name='name']")
	      WebElement name;
	     @FindBy(xpath="//form[@action='/signup']/input[3]")
	      WebElement email;
	     @FindBy(xpath="//button[text()='Signup']")
	      WebElement btn;
	     
	     public void name( String newname)
	     {
	    	 
	    	 name.sendKeys(newname);
	    	 
	     }

	     public void mailadd(String newemail)
	     {
	    	 
	    	 email.sendKeys(newemail);
	    	 
	     }

	     
	     public void clicksignin()
	     {
	    	 
	    	 btn.click();
	    	 
	     }
	    

}
