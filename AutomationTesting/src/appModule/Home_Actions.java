package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.Home;
import pageObjects.Shop;

public class Home_Actions {

	
	public static void Shop_Home_Navigation(WebDriver driver) throws Exception
	{
		Home.lnk_Shop(driver).click();
		Shop.lnk_Home(driver).click();
	}
}
