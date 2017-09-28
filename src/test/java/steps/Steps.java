
package steps;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import codebase.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.LoginObjecten;
import pageObjects.NavigerenObjecten;

public class Steps  {

	/*
	driver.findElement(By.id("idxdt9tz5o")).clear();
	driver.findElement(By.id("idxdt9tz5o")).sendKeys("Katinka's test");
	
	driver.findElement(By.id("idxdt9tz5o")).clear();
	driver.findElement(By.id("idcontextIdentifier")).sendKeys("12345879");
	
	KatjesTest.VoorlettersContactpersoon(driver).sendKeys("Kat");	
	KatjesTest.TussenvoegselContactpersoon(driver).sendKeys("de");
	KatjesTest.AchternaamContactpersoon(driver).sendKeys("Tester");
	*/	
		
	public WebDriver driver = null;

	@Given("^I want to login with browser \"(.*?)\"$")
	public void i_want_to_login_with_browser(String Browser) throws Throwable {

		driver = Inloggen.GetDriver(Browser);
		String InlogUrl = null;
		
		// Dev
		InlogUrl = "https://eu.casewarecloud.com/nl-se-develop/webapps/#login";

		driver.get(InlogUrl);
		driver.manage().window().maximize();
	}
	
	@When("^I type username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_type_username_and_password(String UserName, String Password) throws Throwable {
		Thread.sleep(1500);
		LoginObjecten.UserName(driver).sendKeys(UserName);
		LoginObjecten.PassWord(driver).sendKeys(Password);

		driver.findElement(By.xpath("//button[contains(.,'Aanmelden')]")).click();
	}
	

	@When("^open the Project \"([^\"]*)\"$")
	public void open_the_Project(String Project) throws Throwable {

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String oldTab = driver.getWindowHandle();
		Thread.sleep(1000);
		NavigerenObjecten.Zoekveld(driver).sendKeys(Project);

		Thread.sleep(1500);

		driver.findElement(By.linkText(Project)).click();

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(newTab.get(0));

		Thread.sleep(3500);
	}
	

	@When("^Select the Zorg module$")
	public void select_the_Zorg_module() throws Throwable {

		Thread.sleep(1500);
		NavigerenObjecten.ClickCloud(driver).click();
	
		NavigerenObjecten.NavigerenZorg(driver).click();
		
		 
	}
	
	@When("^Create a new Zorgfile$")
	public void create_a_new_zorgfile() throws Throwable {

		Thread.sleep(3000);
		NavigerenObjecten.SelectNew(driver).click();
		driver.findElement(By.cssSelector("[placeholder='Begin met typen om resultaten te zien.']")).click();
	//	LoginObjecten.NameEntity(driver).sendKeys(NameEntity);
		
	
		}
			  
	@When("^in entity nameentity \"([^\"]*)\"$")
	public void in_entity_NameEntity (String NameEntity) throws Throwable {

		Thread.sleep(1500);
		NavigerenObjecten.SelectEntity(driver).click();
		LoginObjecten.NameEntity(driver).sendKeys(NameEntity);
		LoginObjecten.NameEntity(driver).sendKeys(Keys.RETURN);
		
	
		}
	
	@When("^with name nameproject \"([^\"]*)\"$")
	public void with_name_NameProject (String NameProject) throws Throwable {
	
		Date date = new Date();	
		String Voorbeeld;	
		Voorbeeld = "Kat" + date;
		
		Thread.sleep(1500);
		LoginObjecten.NameProject(driver).sendKeys(Voorbeeld);
		//NavigerenObjecten.SaveProject(driver).click();
		driver.findElement(By.xpath("//button[contains(.,'Opslaan')]")).click();
	
		}
	
	@When("^Importeer saldibalans$")
	public void importeer_saldibalans() throws Throwable {

		Thread.sleep(1500);
	
		driver.findElement(By.partialLinkText("Saldibalans")).click();
		
		Thread.sleep(1500);
		NavigerenObjecten.SelectImport(driver);
		NavigerenObjecten.SelectImportKlik(driver).click();
		NavigerenObjecten.SelectImportCSV(driver).click();
	//	NavigerenObjecten.SelectFile(driver).click();
		Thread.sleep(1500);
	}
	
	@When("^Select the Samenstellen module$")
	public void select_the_Samenstellen_module() throws Throwable {

		Thread.sleep(1500);
		NavigerenObjecten.ClickCloud(driver).click();
	
		driver.findElement(By.linkText("Samenstellen")).click();

		 
	}
	
	@When("^Sluit browser$")
	public void Sluit_browser() throws Throwable {
		
		driver.quit();	
		 
	}
}

