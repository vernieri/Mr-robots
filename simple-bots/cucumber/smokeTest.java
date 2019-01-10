package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest {
	WebDriver driver = new FirefoxDriver();


	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable{
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");

	}
	
	@Then("^user should be able to login sucessfully$")
	public void user_should_be_to_login_sucessfully() throws Throwable{
		driver.findElement(By.id("loginbutton")).click();
		
		
	}
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable{
		driver.quit();
	}
	
}
