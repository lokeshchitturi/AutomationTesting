package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Scenario1_TC_03 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		try {
			driver.get("http://practice.automationtesting.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Shop")).click();
			driver.findElement(By.linkText("Home")).click();
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			List<WebElement> arrivals= (List<WebElement>) js.executeScript("return document.querySelectorAll(\"img[class='attachment-shop_catalog size-shop_catalog wp-post-image']\")");
			
			js.executeScript("window.scrollTo(0,800);");
			
			System.out.println(arrivals.size());
			
			// retrieving image title
			String rubyBookTitle=arrivals.get(0).getAttribute("title");
			// 1st image clicked
			arrivals.get(0).click();
			
			WebElement fullImage=driver.findElement(By.xpath("//img[@class='attachment-shop_single size-shop_single wp-post-image']"));
			
			Assert.assertEquals(fullImage.getAttribute("title"), rubyBookTitle);
			
			// price of a book
			String rubyBookPrice=driver.findElement(By.xpath("//*[@class='woocommerce-Price-amount amount']")).getText();
			
			js.executeScript("window.scrollTo(0,800);");
			driver.findElement(By.xpath("//a[text()='Description']")).click();
			String description=driver.findElement(By.xpath("//div[@id='tab-description']/p")).getText();
			
			System.out.println(description);
			
			// Quantity input box
			WebElement quantity=driver.findElement(By.xpath("//input[@class='input-text qty text']"));
			quantity.clear();
			quantity.sendKeys("2");
			
			WebElement addToBasketButton=driver.findElement(By.xpath("//button[@type='submit']"));
			
			addToBasketButton.click();
			
		/*	WebElement a=driver.findElement(By.xpath("//div[@id='content']/div[1]/text()"));
			System.out.println("----------"+a.getText());
			String Result=a.getText();
			String basketResult=Result.trim();
			
			basketResult=basketResult.substring(1, basketResult.lastIndexOf('"'));
			
			System.out.println(basketResult);*/
		
			
			driver.findElement(By.xpath("//a[text()='View Basket']")).click();
			
			
			WebElement cart=driver.findElement(By.xpath("//*[@class='shop_table shop_table_responsive cart']"));
			List<WebElement> rows=cart.findElements(By.tagName("tr"));
			
			System.out.println("cart size :"+rows.size());
			
			List<WebElement> coloumnData=rows.get(1).findElements(By.tagName("td"));
			
			for (WebElement webElement : coloumnData) {
			try{
				
				if(webElement.getAttribute("data-title").equalsIgnoreCase("product"))
				{
					System.out.println(webElement.getText());
				}
			}
			catch (Exception e) {
				// For first 2 coloumns attribute "data-title" is not there 
				// so it gives null pointer exceptiom
			}
				
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
