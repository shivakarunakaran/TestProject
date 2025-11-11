package pagecls;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Interactive_CV
{
	
	WebDriver driver;
	
	String url="https://dev.erdster.co.in/GlobalNurseForceRegistration";
	
	@BeforeTest
	private void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	private void personalInfo() throws InterruptedException 
	{
		
		//Personal Info
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement imagefile = driver.findElement(By.cssSelector("#imageFile"));
        String filePath="C:\\Users\\karunakaran\\Pictures\\folder\\JPG_1.jpg";
        imagefile.sendKeys(filePath);
        
        WebElement videofile = driver.findElement(By.id("videoFile"));
        String videoPath = "C:\\Users\\karunakaran\\Videos\\Captures\\Oncallorder.mp4";
        videofile.sendKeys(videoPath);
        
        WebElement firstName = driver.findElement(By.cssSelector("#txtFirstName"));
        firstName.sendKeys("Ryan");
        
        WebElement lastName = driver.findElement(By.cssSelector("#txtLastName"));
        lastName.sendKeys("Harris");
        
        WebElement email = driver.findElement(By.cssSelector("#txtEmail"));
        email.sendKeys("ryan@gmail.com");
		
        WebElement phone = driver.findElement(By.cssSelector("#txtPhone"));
        phone.sendKeys("123-097");
        
        WebElement about = driver.findElement(By.cssSelector("#txtAboutme"));
        about.sendKeys("123-097 safdskjfla fkajslfkaj ;lkajs;flkja ;sklfja;sl kaksjf;la skasj;la");
               
        WebElement skills = driver.findElement(By.cssSelector("#dropdownMenuButton"));
        skills.click();
        String[] skillsToSelect = {"ICU", "Oncology", "Endoscopy"};
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input.checkbox.checkbox-skill"));
        for (WebElement checkbox : checkboxes) 
        {
            String value = checkbox.getAttribute("value");
            for (String skill : skillsToSelect) 
            {
                if (value.equals(skill) && !checkbox.isSelected()) 
                {
                    checkbox.click();
//                    System.out.println("Selected skill: " + skill);
                }
            }
        }
        skills.click();
        
        WebElement currentjobElement = driver.findElement(By.cssSelector("#txtctjbrl"));
        currentjobElement.sendKeys("Oncology");
        
        WebElement role = driver.findElement(By.cssSelector("#roleSelect"));
        Select selectrole = new Select(role);
        selectrole.selectByValue("Nurse");

        WebElement license = driver.findElement(By.cssSelector("#rdNclex-rnY"));
//        license.click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(license).click().perform();
        
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", license);
        license.click();
        
        WebElement language1 = driver.findElement(By.cssSelector("#txtlanguage"));
        Select selectlanguage1 = new Select(language1);
        selectlanguage1.selectByIndex(3);
        WebElement selectedOption1 = selectlanguage1.getFirstSelectedOption();
        System.out.println("Selected Language: " + selectedOption1.getText());
        
        WebElement proficiency1 = driver.findElement(By.cssSelector("#proficiencySelect"));
        Select selectproficiency1 = new Select(proficiency1);
        selectproficiency1.selectByIndex(3);
        WebElement selectedOpt1 = selectproficiency1.getFirstSelectedOption();
        System.out.println("Selected proficiency: " + selectedOpt1.getText());
        
//        WebElement addlang = driver.findElement(By.cssSelector("#languageaddanother"));
//        addlang.click();
        
           
        WebElement next = driver.findElement(By.className("btnNext"));
        next.click();
        Thread.sleep(5000);
        
		//Employment Info        
        JavascriptExecutor fromYear = (JavascriptExecutor) driver;
        fromYear.executeScript("document.getElementById('txtfromyear').value='02-2021';");
        
        JavascriptExecutor toYear = (JavascriptExecutor) driver;
        toYear.executeScript("document.getElementById('txttoyear').value='02-2025';");
        
        WebElement jobrole = driver.findElement(By.cssSelector("#txtjobrole"));
        jobrole.sendKeys("Pediatric Nurse");
        
        WebElement facility = driver.findElement(By.cssSelector("#txtfacilityname"));
        facility.sendKeys("London Hospital");
        
        WebElement summary = driver.findElement(By.cssSelector("#doc"));
        summary.sendKeys("In Selenium, CSS selectors are one of the most powerful and flexible ways to identify web elements on a page.");
        
        WebElement faciLocation = driver.findElement(By.cssSelector("#txtfacilitylocation"));
        faciLocation.sendKeys("London");
                  
        WebElement nxtbtn = driver.findElement(By.cssSelector("a[onclick=\"MoveToNext('next','3')\"]"));
        nxtbtn.click();
        
        //Education Info
        WebElement degree = driver.findElement(By.cssSelector("#txtdegree"));
        degree.sendKeys("UG");
        
        WebElement university = driver.findElement(By.cssSelector("#txtuniversity"));
        university.sendKeys("Boston university");
        
        JavascriptExecutor Fromyear = (JavascriptExecutor) driver;
        Fromyear.executeScript("document.getElementById('txtedufromyear').value='01-2016';");
        
        JavascriptExecutor Toyear = (JavascriptExecutor) driver;
        Toyear.executeScript("document.getElementById('txtedutoyear').value='2020-06';");
          
        
	}	
	
}

