package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestAnthem_Steps {

	WebDriver driver = new FirefoxDriver();
    WebElement element = null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		//initialize browser
        driver.get("http://www.antheminc.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User Navigate to Companies Page$")
	public void user_Navigate_to_Companies_Page() throws Throwable {
        element = driver.findElement(By.linkText("Companies"));
	}

	@When("^Navigate to Anthem Blue Cross Page$")
	public void navigate_to_Anthem_Blue_Cross_Page() throws Throwable {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Anthem Blue Cross")).click();
	}

	@Then("^Message displayed Navigation Successful$")
	public void message_displayed_Navigation_Successful() throws Throwable {
        System.out.println("Launched and Navigated through Anthem Portal successfully");
	}

}
