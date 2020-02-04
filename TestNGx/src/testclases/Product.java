package testclases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Product {

	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		
		
	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 
		}
	
	
	@Test(priority=1)
	 
	public void amazon() {
		
		driver.get("https://www.amazon.in/");
        
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone XR (64GB) - Yellow");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
					
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		
		String strText= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")).getText();
		System.out.println("the price is:" + strText);
	
	
	}
		@Test(priority=2)
		
		public void flipkart() {
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone XR (64GB) - Yellow");
			
			driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys(Keys.ENTER);
			
			String str= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div/div/div")).getText();
		    System.out.println("The price value is:" + str);
		
			
		
	}
		
		@Test(priority=3)
		
		public void Compareprice() {
			
	
		
	    driver.navigate().to("https://www.amazon.in/");
	    
	    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone XR (64GB) - Yellow");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		String strText= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")).getText();
		System.out.println("the Amazon price value is:" + strText);
		
	    
	
	    driver.navigate().to("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone XR (64GB) - Yellow");
		driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys(Keys.ENTER);
		String str= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div/div/div")).getText();
	    System.out.println("The flipkart price value is:" + str);
	    
	    
	    if ((strText.equals(str)) != true) {
	    System.out.println("Campare Price not same");
	    }
	  
	
		}
	@AfterMethod
	
	public void down() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	} 
	
}
	

