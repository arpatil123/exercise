package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.baseclass;

public class create_acc extends baseclass {

	
		 WebDriver driver;
			public create_acc(WebDriver driver) 
			{
		      
				PageFactory.initElements(driver, this);
			}
				
			
		     @FindBy(xpath="//input[@id='id_gender2']")
		      WebElement gender;
		     @FindBy(xpath="//input[@id='password']")
		      WebElement pass;
		     @FindBy(id="first_name")
		      WebElement first;
		     @FindBy(id="last_name")
		      WebElement last;
		     @FindBy(id="address1")
		      WebElement add;
		     @FindBy(id="country")
		      WebElement country;
		     @FindBy(id="state")
		      WebElement state;
		     @FindBy(id="city")
		      WebElement city;

		     @FindBy(id="zipcode")
		      WebElement code;
		  
		     @FindBy(id="mobile_number")
		      WebElement number;
		     
		     @FindBy(xpath="//button[text()='Create Account']")
		      WebElement register;
		     
		     public void clickgender()
		     {
		    	 
		    	 gender.click();
		    	 
		     }
		     public void enterpass( String password)
		     {
		    	 
		    	 pass.sendKeys(password);
		    	 
		     }
		     public void enterfirstname( String firstname)
		     {
		    	 
		    	 first.sendKeys(firstname);
		    	 
		     }

		     public void enterlastname(String lastname)
		     {
		    	 
		    	 last.sendKeys(lastname);
		    	 
		     }
		     public void enteraddress(String address)
		     {
		    	 
		    	 add.sendKeys(address);
		    	 
		     }
		     public void entercountry(String text)
		     {
		    	 
		    	Select obj=new Select(country);
		    	obj.selectByVisibleText(text);
		    	 
		     }
		     public void enterstate(String statename)
		     {
		    	 
		    	 state.sendKeys(statename);
		    	 
		     }
		     public void entercity(String cityname)
		     {
		    	 
		    	 city.sendKeys(cityname);
		    	 
		     }
		     public void enterzipcode(String codeno)
		     {
		    	 
		    	 code.sendKeys(codeno);
		    	 
		     }
		     public void entermob_no(String mobno)
		     {
		    	 
		    	 number.sendKeys(mobno);
		    	 
		     }
		     public void click()
		     {
		    	 
		    	 register.click();
		    	 
		     }


}
