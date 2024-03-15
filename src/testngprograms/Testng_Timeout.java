package testngprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_Timeout {
	WebDriver driver;
  @Test
  public void google() {
      driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//span[normalize-space()='Shopping']")).click();
	driver.findElement(By.xpath("//div[@class='GhTN2e']//div[1]//a[1]//div[1]//img[1]")).click();
  
  }
  @Test(timeOut=3000)
  public void testng() {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("TestNG"+Keys.ENTER);
	 // driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//span[normalize-space()='Images']")).click();
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
