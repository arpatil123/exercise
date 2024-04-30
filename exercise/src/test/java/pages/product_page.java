package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseclass;

public class product_page extends baseclass {
	 WebDriver driver;
		public product_page(WebDriver driver) 
		{
	      
			PageFactory.initElements(driver, this);
		}
			
		
	     @FindBy(xpath="//a[@href='/products']")
	      WebElement item;
	     
	     @FindBy(xpath="//img[@src='/get_product_picture/1']")
	      WebElement item1;
	    
	     
	     public void clickproduct()
	     {
	    	 
	    	 item.click();
	    	 item1.click();
	    	 
	     }
	     
	    
	}
