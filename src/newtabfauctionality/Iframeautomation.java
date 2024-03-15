package newtabfauctionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class Iframeautomation {
	
	WebDriver driver;
	
  public void newtab() throws InterruptedException {
	  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	  Thread.sleep(3000);
	  WebElement frm= driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(frm);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
	 
	  Thread.sleep(2000);
	 // driver.switchTo().defaultContent();
	  
	  driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
	  
	  Thread.sleep(2000);
	    
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
