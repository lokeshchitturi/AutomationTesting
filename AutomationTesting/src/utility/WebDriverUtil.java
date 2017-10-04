package utility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	
	public static void openUrl(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		js=(JavascriptExecutor) driver;
		wait=new WebDriverWait(driver, 20);
	}
	
	public static void scrollDown()
	{	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,700);");
	}
	
	
	public static void waitUntilPageLoad()
	{
		
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	}
	
	public static void executeJavaScript(String JavascriptQuery)
	{
		js.executeScript("");
	}
}
