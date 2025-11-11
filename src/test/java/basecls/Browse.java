package basecls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Browse 
{
	
	public WebDriver driver;
		
	String baseurl="https://gnfbots.com/Registration?utm_source=chatgpt.com";
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
}
//Shiva Karunakaran
//Shiva Karunakaran
