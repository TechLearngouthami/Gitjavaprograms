package testngprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_ignore_skip_Disable {
	WebDriver driver;
	
	 @Test(priority=1)
	  public void gmail() 
	  {
	  driver.get("https://www.gmail.com/");
	  }
	  @Test(priority=3)
	  public void google() {
		 driver.get("https://www.google.com/");
	  }
	  @Test(priority=0,enabled=false)
	  public void redmine() {
		  driver.get("https://www.redmine.com/");
	  }
	  @Test(priority=2,enabled=false)
	  public void selenium() {
		  driver.get("https://www.selenium.dev/"); 
		  

	  }
	  @Test(priority=4,enabled=false)
	  public void facebook() {
		  driver.get("https://www.facebook.com/");
	  }
	  @Test(priority=5,enabled=false)
	  public void twitter() {
		  driver.get("https://www.twitter.com/");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
