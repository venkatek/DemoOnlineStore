package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest2 {

	public static void main(String[] args) {

		//initialise browser
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ticketmaster.co.uk"); 

		//locate the menu to hover over using its xpath
		WebElement menu = driver.findElement(By.xpath("//*[@id='music']"));

		//Initiate mouse action using Actions class
		Actions builder = new Actions(driver);   

		// move the mouse to the earlier identified menu option
		builder.moveToElement(menu).build().perform();

		// wait for max of 5 seconds before proceeding. This allows sub menu appears properly before trying to click on it
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='subNav_music_menu']/tbody/tr[2]/td[1]/a[1]")));  // until this submenu is found

		//identify menu option from the resulting menu display and click
		WebElement menuOption = driver.findElement(By.xpath("//*[@id='subNav_music_menu']/tbody/tr[2]/td[1]/a[1]"));
		menuOption.click();
		}
}
