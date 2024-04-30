package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.baseclass;


	public class successfully_create extends baseclass {
		 WebDriver driver;
			public successfully_create(WebDriver driver) 
			{
		      
				PageFactory.initElements(driver, this);
			}
				
			
		     @FindBy(xpath="//p[text()='Congratulations! Your new account has been successfully created!']")
		      WebElement text1;
		     
		     @FindBy(xpath="//a[text()='Continue']")
		      WebElement button;
		     
		     @FindBy(xpath="//ul[@class='nav navbar-nav']/li[4]")
		      WebElement logout;
		    
		     
		     public void confirm()
		     {
		    	 
		    	 String text2= text1.getText();
		    //	 String text3="Congratulations! Your new account has been successfully created!";
		    	 Assert.assertEquals(text2, "Congratulations! Your new account has been successfully created!");
		    	 System.out.println("successfully created="+text2);
		     }

		     public void  continuebtn()
		     {
		    	 
		    	 button.click();
		    	 
		     }
		     public void  signout()
		     {
		    	 
		    	 logout.click();
		    	 
		     }
		   

			

}
