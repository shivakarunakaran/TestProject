package pagecls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAutomation 
{
	
	WebDriver driver;

	By create=By.xpath("//*[@id=\"root\"]/div[3]/div/div[1]/div[2]/div[3]/div");
	By start=By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/div[2]/div[1]/div/b");
	By intentname=By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/form/div[1]/div/input");
	By description=By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/form/div[2]/div/input");

	public CreateAutomation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void proceed()
	{
		driver.findElement(create).click();
		driver.findElement(start).click();
	}
	
	public void intent(String intname, String desc)
	{
		driver.findElement(intentname).sendKeys(intname);
		driver.findElement(description).sendKeys(desc);
	}
	
}




