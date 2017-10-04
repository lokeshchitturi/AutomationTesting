package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.List;

public class Home {

	WebElement element=null;
	
	public static WebElement lnk_Shop(WebDriver driver) throws Exception
	{
		return driver.findElement(By.linkText("Shop"));
	}
	
	public static List<WebElement> imgs_Slider(WebDriver driver) throws Exception
	{
		return driver.findElements(By.xpath("//*[@class=\"n2-ss-slide-background-image n2-ss-slide-fill n2-ow\"]"));
	}
	
	public static List<WebElement> imgs_Arrival(WebDriver driver) throws Exception
	{
		return driver.findElements(By.xpath("//*[@class='attachment-shop_catalog size-shop_catalog wp-post-image']"));
	}
}
