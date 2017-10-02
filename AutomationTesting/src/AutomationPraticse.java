import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPraticse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {

			driver.get("http://demo.automationtesting.in/Index.html");
			// driver.get("http://demo.automationtesting.in/Register.html");

			JavascriptExecutor js = (JavascriptExecutor) driver;
			String emailId = "lokeshchitturi@gmail.com";
			js.executeScript("var test='" + emailId + "';" + "document.getElementById(\"email\").value=test");
			js.executeScript("document.getElementById('enterimg').click()");

			/*
			 * WebElement s=(WebElement)
			 * js.executeScript("return document.getElementById(\"email\")");
			 * s.sendKeys("Hello");
			 */

			/*
			 * WebElement a=(WebElement) js.
			 * executeScript("return document.querySelector(\"input[placeholder='First Name']\")"
			 * ); a.sendKeys("woww its working");
			 */

			String firstname = "lokesh";
			String lastname = "chitturi";
			String gender = "male";
			js.executeScript("var fn='" + firstname + "';" + "var ln='" + lastname + "';"
					+ "document.querySelector('input[placeholder=\"Last Name\"]').value=fn;"
					+ "document.querySelector('input[placeholder=\"First Name\"]').value=ln;"
					+ "document.querySelector('textarea[ng-model=\"Adress\"]').value='Hyderabad-500018';"
					+ "document.querySelector('input[ng-model=\"EmailAdress\"]').value='chitturi1234@gmail.com';"
					+ "document.querySelector('input[ng-model=\"Phone\"]').value='9988776655';" + "");

			List<WebElement> radios = (List<WebElement>) js
					.executeScript("return document.getElementsByName('radiooptions')");
			System.out.println("---------------" + radios.size());
			for (WebElement webElement : radios) {

				if (gender.equalsIgnoreCase(webElement.getAttribute("value")))
					webElement.click();

			}
			
			List<WebElement> checkboxes=(List<WebElement>) js.executeScript("return $('input[type=\"checkbox\"')");
			
			System.out.println(checkboxes.size());
			for (WebElement webElement : checkboxes) {
				if(webElement.getAttribute("id").equalsIgnoreCase("checkbox2"))
				{
					webElement.click();
				}
			}
			
			js.executeScript("window.scrollBy(0,400);"
			+"$(\"div[id='msdd']\").click()");
			
			Thread.sleep(1000);
			List<WebElement> lanugaes=(List<WebElement>) js.executeScript("return $(\"a[class='ui-corner-all']\")");
			
			for (WebElement webElement : lanugaes) {
				if(webElement.getText().equalsIgnoreCase("english"))
				{
					System.out.println(webElement.getText());
					webElement.click();
				}
				if(webElement.getText().equalsIgnoreCase("dutch"))
				{
					System.out.println(webElement.getText());
					webElement.click();
				}
				
			}
			
			
			List<WebElement> ls1= (List<WebElement>) js.executeScript("return $('#Skills')");
			WebElement ele1=ls1.get(0);
			Select skills=new Select(ele1);
			skills.selectByVisibleText("Java");
			
			List<WebElement>ls2= (List<WebElement>) js.executeScript("return $('#countries')");
			WebElement ele2=ls2.get(0);
			Select countries=new Select(ele2);
			countries.selectByValue("India");
			
			
			List<WebElement>ls3=(List<WebElement>) js.executeScript("return $('select[id=\"yearbox\"]')");
			WebElement ele3=ls3.get(0);
			Select year=new Select(ele3);
			year.selectByValue("1994");
			
			 js.executeScript("$('select[placeholder=\"Month\"]').val('6');"+
			 "$('select[placeholder=\"Day\"]').val('7');"+
			 "$('#firstpassword').val('test@123')");
	
			
			List ls5=(List) js.executeScript("return $('#secondpassword')");
			WebElement spassword=(WebElement) ls5.get(0);
			spassword.sendKeys("test@123");
			
			js.executeScript("$('span[role=\"combobox\"]').click();"+
			"$('input[class=\"select2-search__field\"]').val(\"India\");"
			+"$('input[class=\"select2-search__field\"]').click();"		);
			
/*			List<WebElement>h5= (List<WebElement>) js.executeScript("return $('span[role=\"combobox\"]')");
			WebElement dd=h5.get(0);
			dd.click();
			
			List<WebElement>h6=(List<WebElement>) js.executeScript("return $('input[class=\"select2-search__field\"]')");
			WebElement dd1=h6.get(0);
			dd1.sendKeys("India");
			dd1.sendKeys(Keys.RETURN);
*/			
			WebElement a=driver.findElement(By.xpath("//span[@role='combobox']"));
			a.click();
			
			WebElement b=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
			b.sendKeys("India");
			b.sendKeys(Keys.RETURN);
			
			Actions action=new Actions(driver);
			
			
			WebElement submitButton=(WebElement) js.executeScript("$('#submitbtn')");
			Thread.sleep(4000);
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.close();
		}

	}
}
