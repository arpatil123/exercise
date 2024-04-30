package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	ReadConfig readConfig =new ReadConfig();
	
	public String url= readConfig.getbaseurl();
	public String browser= readConfig.getbrowser();
	public String title= readConfig.gettitle();
	public static WebDriver driver;
//launch browser

	@BeforeClass
	public void launchbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get(url);
	}
}
	// close browser
//	@AfterClass
	//public void close() {
	//	driver.close();
	//}
//}
