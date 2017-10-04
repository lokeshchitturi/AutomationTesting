package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class Shop {
	
	WebElement element= null;
	
	public static WebElement lnk_Home(WebDriver driver){
		return driver.findElement(By.linkText("Home"));
	}
	
}
