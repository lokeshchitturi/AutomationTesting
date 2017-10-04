package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.List;

public class Home {

	WebElement element=null;
	
	public static WebElement lnk_Shop(WebDriver driver)
	{
		return driver.findElement(By.linkText("Shop"));
	}
	
	public static List<WebElement> imgs_Slider(WebDriver driver)
	{
		return driver.findElements(By.xpath("//*[@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]"));
	}
	
}
