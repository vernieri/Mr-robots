package principal; //change here brow.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe"); //Poe onde ta seu gecko
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Test Selenium");
		
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
		driver.findElement(By.xpath(".//*[@id='persist_box']")).click();
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Sep");
		
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[id='day']")));
		sel2.selectByValue("6");
		
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.deselectByIndex(6);
		
		driver.findElement(By.xpath(".//*[@id='u_0_11']")).click();

		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		
		driver.navigate().back();
		
		//driver.quit();
		
		
		
		
	}

}
