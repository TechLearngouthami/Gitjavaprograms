package testngprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.hotkey.Keys;
import org.testng.annotations.AfterTest;

public class Testng_decreption {
	WebDriver driver;
	
  @Test(description="logo")
  public void dm2() {
	 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/header/div/div/div/a/img")).click();
	  
  }
  @Test(description="meanu search")
  public void dm3() throws InterruptedException {
		 
	  driver.findElement(By.xpath("//li[@data-testid='headerArticlesMenuButton']")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@class='d-none d-lg-flex navigation-block']//div//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//div[1]//button[1]//a[1]")).click();
	  		
	 
	  
  }
  @Test(description="search")
  public void dm5() throws InterruptedException {
		 
	  driver.findElement(By.xpath("//*[@id=\"__BVID__19\"]")).sendKeys("java");
	  driver.findElement(By.xpath("//*[@id=\"__BVID__19\"]")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	 
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.dummies.com/");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
