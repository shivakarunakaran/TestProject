package pagecls;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlowBuild 
{
	
	WebDriver driver;
	
	String url="https://zealous-sand-03e0d440f.4.azurestaticapps.net/";
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test	
	public void login() throws InterruptedException
	{
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[1]/div/input"));
		username.sendKeys("superadmin");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/div/input"));
		password.sendKeys("erd@123");
		WebElement remebmer=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/div[1]"));
		remebmer.click();
		WebElement login=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[4]/button[1]"));
		login.click();
//		WebElement error=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/p"));
//		Assert.assertTrue(error.isDisplayed(), "Invalid login. 4 attempts remaining.");
		System.out.println("Login Successfull");	
		
		
		
		//FlowBuilder Create Automation
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement createautomation=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".lucide-circle-plus")));
		createautomation.click();
		
//		WebElement close=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".lucide-x")));
//		close.click();
		
		WebElement start=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".text-left")));
		start.click();
			
		WebElement selectintent=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".border-solid-gray")));
		Select sortBy = new Select(selectintent);
		sortBy.selectByValue("Recruitment");
		System.out.println(sortBy.getFirstSelectedOption().getText());
		
		WebElement intentdescription=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/form/div[3]/div[2]/input"));
		intentdescription.sendKeys("Automation");
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"my-checkbox\"]"));
		checkbox.click();
		
		
//		WebElement proceed=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/form/div[5]/button[2]")));
//		proceed.click();
		
		WebElement cancel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/form/div[5]/button[1]")));
		cancel.click();
		
		
		
		//FlowBuilder Edit Intent
		
		WebElement editaitestone=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[row-id='5'] [col-id='action'] .lucide-square-pen")));
		editaitestone.click();
		
		WebElement testonedescription=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/form/div[3]/div[2]/input"));
		testonedescription.sendKeys("Automation Testing");
		
		WebElement testonecheckbox=driver.findElement(By.xpath("//*[@id=\"my-checkbox\"]"));
		testonecheckbox.click();
		
		WebElement testonecancel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div/div/form/div[5]/button[1]")));
		testonecancel.click();
		
		
		
		//Select CLU and Edit Project
	
		WebElement dialogflow=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".selected-nav-items")));
		dialogflow.click();
	
		WebElement dialog=driver.findElement(By.cssSelector(".selected-nav-items"));
		dialog.click();
		
		WebElement clu=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div[2]/nav/ul/li[1]/div[2]/div/ul/li[2]"));
		clu.click();
		System.out.println("CLU is clicked");
				
		WebElement search=driver.findElement(By.cssSelector(".font-semibold"));
		search.click();
		search.sendKeys("onefortest");
	
		WebElement editbtn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".lucide-square-pen")));
		editbtn.click();
				
		WebElement name=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[3]/div/div[2]/div/div[1]/div/div/input"));
		name.clear();
		name.sendKeys("onefortestautomation");
		
		WebElement cludescription=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[3]/div/div[2]/div/div[2]/div/input"));
		cludescription.clear();
		cludescription.sendKeys("Automate Testing Purpose");
		
		WebElement language=driver.findElement(By.xpath("//*[@id=\"select-options\"]"));
		Select Language=new Select(language);
		Language.selectByValue("2");
		System.out.println("Language Selected");
		
		WebElement multilanguage=driver.findElement(By.xpath("//*[@id=\"my-checkbox\"]"));
		multilanguage.click();
	
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[3]/div/div[2]/div/div[5]/div/input"));
		Actions action = new Actions(driver);
		Thread.sleep(500);
		action.dragAndDropBy(slider, 170, 0).perform();
		Thread.sleep(500);
		action.dragAndDropBy(slider, -170, 0).perform();
		Thread.sleep(500);
		action.dragAndDropBy(slider, 0, 0).perform();
		
		WebElement closeclu=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cursor-pointer .lucide-x")));
		closeclu.click();
				
//		WebElement updatebtn=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[3]/div/div[2]/div/div[6]/button"));
//		updatebtn.click();
		
		
		
		//GenAI
		
		WebElement genAi=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='GenAI']")));
		genAi.click();
		System.out.println("GenAI Open");
		
		WebElement knowledgeBase=driver.findElement(By.xpath("//span[text()='Knowledge Base']"));
		knowledgeBase.click();
		
		WebElement baseedit=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[row-id='4'] .lucide-square-pen")));
		baseedit.click();
		
		WebElement editname=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div[2]/div/div[1]/div/div/input"));
		editname.clear();
		editname.sendKeys("testautomation");
		
		WebElement editdesc=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div[2]/div/div[2]/div/input"));
		editdesc.clear();
		editdesc.sendKeys("Automation Testing");
		
        WebElement editlangu=driver.findElement(By.id("select-options"));
        Select select=new Select(editlangu);
        select.selectByIndex(2);
        
        WebElement clickmulti=driver.findElement(By.xpath("//*[@id=\"my-checkbox\"]"));
        clickmulti.click();
        
        WebElement editslider=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div/div[2]/div/div[5]/div/input"));
//		Actions action = new Actions(driver);
		Thread.sleep(500);
		action.dragAndDropBy(editslider, 170, 0).perform();
		Thread.sleep(500);
		action.dragAndDropBy(editslider, 10, 0).perform();
		
		WebElement editclose=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cursor-pointer .lucide-x")));
		editclose.click();
		
		
	}
	
}
