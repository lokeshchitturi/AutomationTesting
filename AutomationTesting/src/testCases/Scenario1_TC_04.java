package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import appModule.Home_Actions;
import pageObjects.Home;
import pageObjects.Product;
import utility.WebDriverUtil;

public class Scenario1_TC_04 extends WebDriverUtil{

	public static void main(String[] args) {

		try {
			WebDriverUtil.openUrl("http://practice.automationtesting.in/");
			Thread.sleep(2000);

			Home_Actions.Shop_Home_Navigation(driver);

			WebDriverUtil.scrollDown();

			List<WebElement> ls = Home.imgs_Arrival(driver);

			// Clicking on Selenium Ruby Image
			// Displays Product details
			ls.get(0).click();
			
			WebDriverUtil.scrollDown();
			Product.btn_Description().click();
			String description=Product.textArea_Description().getText();

			System.out.println(description);
			
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			driver.close();
			
		}
	}

}
