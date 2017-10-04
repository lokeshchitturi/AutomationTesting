package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.Home_Actions;
import junit.framework.Assert;
import pageObjects.Home;
import pageObjects.Product;
import utility.WebDriverUtil;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class Scenario1_TC_03 extends WebDriverUtil {

	public static void main(String[] args) {
		
		
		try {
		
			WebDriverUtil.openUrl("http://practice.automationtesting.in/");
			
			Thread.sleep(2000);
			
			Home_Actions.Shop_Home_Navigation(driver);
			
			WebDriverUtil.scrollDown();
			
			List<WebElement> ls=Home.imgs_Arrival(driver);
			
			// Clicking on Selenium Ruby Image
			// Displays Product details
			ls.get(0).click();
			Thread.sleep(4000);
			
			// verifying whether product image is clickable or not
			String a="Selenium Ruby";
			Product.img_Product(a).click();
			
			wait.until(ExpectedConditions.visibilityOf(Product.img_Product(a)));
			
			js.executeScript("document.querySelector(\"a[class='pp_close']\").click()");
			
			Thread.sleep(3000);
			
			driver.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.close();
		}
		
	}
	
}
