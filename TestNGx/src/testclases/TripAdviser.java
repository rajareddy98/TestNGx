package testclases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TripAdviser {
WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		
	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 
		}
	
	@Test
	
	public void TripStart() {
		
		driver.get("https://www.tripadvisor.in");
		
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[5]/div")).click();
		
		/*driver.findElement(By.cssSelector("#mainSearch")).sendKeys("Club Mahindra");
		
		driver.findElement(By.xpath("//*[@id=\"SEARCH_BUTTON_CONTENT\"]")).click();
		*/
		
	}
	
	
	
	
	@AfterMethod
	
	public void End() {
		driver.quit();
		
	}
	
	}
