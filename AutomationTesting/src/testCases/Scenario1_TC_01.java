package testCases;

import pageObjects.Home;
import pageObjects.Shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class Scenario1_TC_01 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		try {
			driver.get("http://practice.automationtesting.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			Home.lnk_Shop(driver).click();
			Shop.lnk_Home(driver).click();
			List<WebElement>sliders=  Home.imgs_Slider(driver);
			
			int count=sliders.size();
			
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
