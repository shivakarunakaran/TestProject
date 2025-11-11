package testcls;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basecls.Browse;
import pagecls.CreateAutomation;
import pagecls.Dashboard;
import pagecls.Login;

public class Testrun extends Browse
{
	
	@Test(enabled = true)
	public void login()
	{
		Login login=new Login(driver);
		login.setvalues("superadmin", "erd@123");
		login.login();
		System.out.println("Completed");
	}
	
	@Test(enabled = true)
	public void search() throws InterruptedException
	{
		Dashboard dashboard=new Dashboard(driver);
		dashboard.editaction();
		dashboard.searchvalue("onefortest");
	}
	
	@Test(enabled = true)
	public void creation()
	{
		CreateAutomation creat=new CreateAutomation(driver);
		creat.proceed();
		creat.intent("Registration ", "Vehicle Registration ");
	}
	
}
