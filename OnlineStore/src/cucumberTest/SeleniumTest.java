package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

	   public static void main(String[] args) {
	 
			//initialise browser
			WebDriver driver = new FirefoxDriver();
	        driver.get("http://www.store.demoqa.com/");
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        WebElement element = driver.findElement(By.linkText("Product Category"));
	 
	        Actions action = new Actions(driver);
	 
	        action.moveToElement(element).build().perform();
	 
	        driver.findElement(By.linkText("iPads")).click();
	 
	        }
}