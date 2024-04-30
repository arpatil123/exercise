package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseclass;

public class homepage extends baseclass
{
	 WebDriver driver;
	public homepage(WebDriver driver) 
	{
      
		PageFactory.initElements(driver, this);
	}
		
	
     @FindBy(xpath="//a[@href='/login']")
      WebElement signin;
     
    
     
     public void clicksignin()
     {
    	 
    	 signin.click();
    	 
     }
     
    
}
