package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;

import appModule.Home_Actions;
import pageObjects.Home;
import utility.WebDriverUtil;
public class Scenario1_TC_02 extends WebDriverUtil{
	
	public static void main(String[] args) {
		
		
		
		try {
			WebDriverUtil.openUrl("http://practice.automationtesting.in/");
			Home_Actions.Shop_Home_Navigation(driver);
			WebDriverUtil.scrollDown();
			//attachment-shop_catalog size-shop_catalog wp-post-image
			List<WebElement> ls=Home.imgs_Arrival(driver);
			int count=ls.size();
			if(count==3)
			{
				System.out.println("It has "+count+" sliders-- Test Case pass");
			}
			else
			{
				System.out.println("It has "+count+" sliders -- Test Case fail");
			}
			
			Thread.sleep(3000);
			
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.close();
		}
		
	}

}
