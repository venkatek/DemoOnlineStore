package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class SeleniumTest3 {

	   public static void main(String[] args) {
	 
			//initialize browser
			WebDriver driver = new FirefoxDriver();
	        driver.get("http://www.antheminc.com");
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        WebElement element = driver.findElement(By.linkText("Companies"));
	 
	        Actions action = new Actions(driver);
	 
	        action.moveToElement(element).build().perform();
	 
	        driver.findElement(By.linkText("Anthem Blue Cross")).click();

	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        System.out.println("Launched and Navigated through Anthem Portal successfully");
	        
	        }
}