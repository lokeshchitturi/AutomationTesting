package testCases;

import appModule.Home_Actions;
import utility.WebDriverUtil;
public class Scenario1_TC_02 extends WebDriverUtil{
	
	public static void main(String[] args) {
		
		
		
		try {
			WebDriverUtil.openUrl("http://practice.automationtesting.in/");
			Home_Actions.Shop_Home_Navigation(driver);
			WebDriverUtil.scrollDown();
			//attachment-shop_catalog size-shop_catalog wp-post-image
			
			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.close();
		}
		
	}

}
