package iframefeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class Iframeautomation {
	
	WebDriver driver;
	
  public void frameapplication() throws InterruptedException {
	  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	  Thread.sleep(3000);
	  WebElement frm= driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(frm);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	  
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  
	  
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
