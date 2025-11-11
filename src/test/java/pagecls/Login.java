package pagecls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	
	WebDriver driver;
	
	By username=By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[1]/div/input");
	By password=By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/div/input");
	By remember=By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/div[1]");
	By login=By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[4]/button[1]");
	
	public Login(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void setvalues(String name, String pass)
	{
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(pass);
	}
	
	public void login()
	{
		driver.findElement(remember).click();
		driver.findElement(login).click();	
	}
	
}
