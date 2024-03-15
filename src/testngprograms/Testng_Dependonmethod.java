package testngprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_Dependonmethod {
	private static final String Dependsonmethods = null;
	private static final String[] method2 = null;
	WebDriver driver;
  //@Test(priority=1)
	@Test(dependsOnMethods="method2")
  public void method1() {
    //  driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
  }
	@Test
  //@Test(priority=0)
  public void method2() {
	  driver.get("https://www.google.com/");
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
