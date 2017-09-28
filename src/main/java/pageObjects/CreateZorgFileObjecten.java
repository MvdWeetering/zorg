package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CreateZorgFileObjecten {
	
	private static WebElement element = null;
	
	public static WebElement SelectSaldibalans(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Saldibalans"));
	    return element;	
		}

	public static WebElement SelectImport(WebDriver driver){	
		element = driver.findElement(By.cssSelector("*[class^='btn-group']"));			
				//By.cssSelector("*[class^='tech']");
				//By.cssSelector("*[class$='text_left']");
		return element;
		}

	public static WebElement SelectImportKlik(WebDriver driver){	
			element = driver.findElement(By.className(("caret")));	
		return element;
		}

	public static WebElement SelectImportCSV(WebDriver driver){
		element = driver.findElement(By.partialLinkText("Excel of CSV import"));
		return element;
		}

	/*
	public static WebElement SelectFile(WebDriver driver){
		WebElement parent = driver.findElement(By.cssSelector("*[class='modal-dialog']"));
		element = parent.findElement(By.cssSelector("[upload-browse='!uploadEnabled']"));
		return element;
		} Vragen aan Michel  -> try his robot function: Zie Steps
				
	*/ 

	public static WebElement SelectEntity(WebDriver driver){	
			element = driver.findElement(By.cssSelector("[placeholder='Begin met typen om resultaten te zien.']"));
		return element;
	}



}
