package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.WebDriverUtil;

public class Product extends WebDriverUtil{
	
	WebElement element=null;
	
	public static WebElement img_Product(String nameOfProduct)
	{
		return driver.findElement(By.xpath("//img[@title='"+nameOfProduct+"']"));
	}
	
	public static WebElement btn_Description()
	{
		return driver.findElement(By.xpath("//a[text()='Description']"));
	}
	
	public static WebElement textArea_Description()
	{
		return driver.findElement(By.xpath("//div[@id='tab-description']/p"));
	}
	

}
