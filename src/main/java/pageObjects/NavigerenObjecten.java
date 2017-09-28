package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigerenObjecten {
	
	private static WebElement element = null;	
	
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
	WebElement parent = driver.findElement(By.cssSelector("*[class$='cw-ButtonBar']"));
	element = parent.findElement(By.cssSelector("[title='Nieuw']"));
	return element;
	}


}



