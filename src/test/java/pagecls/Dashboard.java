package pagecls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard 
{
	WebDriver driver;

	By dialog=By.cssSelector(".selected-nav-items");
	By clu=By.xpath("//*[@id=\\\"root\\\"]/div[2]/div/div/div/div[2]/nav/ul/li[1]/div[2]/div/ul/li[2]");
	By search=By.cssSelector(".font-semibold");
	By edit=By.cssSelector(".lucide-square-pen");
	By name=By.xpath("//*[@id=\\\"root\\\"]/div[3]/div/div[3]/div/div[2]/div/div[1]/div/div/input");
	
	public Dashboard(WebDriver driver) 
	{
		this.driver=driver;		
	}
	
	public void editaction() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(dialog).click();
		driver.findElement(clu).click();
		driver.findElement(search).click();
		driver.findElement(edit).click();
		driver.findElement(name).click();
	}
	
	public void searchvalue(String svalue)
	{
		driver.findElement(search).sendKeys(svalue);
	}
	
}
