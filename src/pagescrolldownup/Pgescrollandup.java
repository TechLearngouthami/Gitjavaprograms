package pagescrolldownup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Pgescrollandup {
	WebDriver driver;
	
  @Test
  public void scrooll() throws InterruptedException {
	  driver.get("https://www.selenium.dev/");
	 
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,4200)");
		 Thread.sleep(3000);
		
	  
	  driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
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
