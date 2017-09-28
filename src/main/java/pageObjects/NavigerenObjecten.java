package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigerenObjecten {
	
	private static WebElement element = null;	
//	public static WebElement NavigerenTax(WebDriver driver){//	 		
//		element = driver.findElement(By.linkText("NL Tax Engagement"));
//		return element;
//	}
	
	
	public static WebElement NavigerenZorg(WebDriver driver){ 		
		element = driver.findElement(By.linkText("Zorg"));		
		return element;
	}
	
			

	public static WebElement ClickCloud(WebDriver driver){
	    element = driver.findElement(By.className(("GJJ2145DCFD")));
		return element;
	}
	
	public static WebElement Zoekveld(WebDriver driver){	    
		WebElement parent = driver.findElement(By.id("main"));
	    element = parent.findElement(By.cssSelector("[placeholder='Zoeken...']"));
		return element;
	}
	
public static WebElement SelectNew(WebDriver driver){	    
	//WebElement parent = driver.findElement(By.id("main"));    
	WebElement parent = driver.findElement(By.cssSelector("*[class$='cw-ButtonBar']"));
	element = parent.findElement(By.cssSelector("[title='Nieuw']"));
	return element;
	}

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
	} Vragen aan Michel
*/ 

public static WebElement SelectEntity(WebDriver driver){	
		element = driver.findElement(By.cssSelector("[placeholder='Begin met typen om resultaten te zien.']"));
	return element;
}

public static WebElement SaveProject(WebDriver driver){	
	WebElement parent = driver.findElement(By.className("GJJ2145DK4 GJJ2145DH5 GJJ2145DCID"));
	element = parent.findElement(By.partialLinkText("Opslaan"));
	return element;
}

}



