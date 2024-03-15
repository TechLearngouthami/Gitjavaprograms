package testngprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Testngprorityorder2ndprogm {
	WebDriver driver;
	
  @Test(priority=1)
  public void gmail() 
  {
  driver.get("https://www.gmail.com/");
  }
  @Test
  public void google() {
	 driver.get("https://www.google.com/");
  }
 /* @Test
  public void redmine() {
	  driver.get("https://www.redmine.com/");
  }*/
  @Test(priority=2)
  public void selenium() {
	  driver.get("https://www.selenium.dev/"); 
	   }
  @Test(priority=0)
  public void facebook() {
	  driver.get("https://www.facebook.com/");
  }
  @Test(priority=3)
  public void twitter() {
	  driver.get("https://www.twitter.com/");
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }
  @AfterClass
  public void afterClass() {
  }

}
