package alertfunctionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alertokcanclesendoktext {
	WebDriver driver;
  @Test
  public void alertok() throws InterruptedException {
	  driver.get("https://www.seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();

	  Thread.sleep(5000);
	  Alert alt=driver.switchTo().alert();
	  alt.accept();
	  
  }
  @Test
  public void alertcancle() throws InterruptedException {
	  driver.get("https://www.seleniumlearn.com/confirmation-dialog-box");
	  
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  Alert alt=driver.switchTo().alert();
	  alt.dismiss();
	  
	  

	 
	//  driver.switchTo().alert().dismiss();
	  
  }
  @Test
  public void sendtext() throws InterruptedException {
	  driver.get("https://www.seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(3000);
	  Alert alt=driver.switchTo().alert();
	  alt.sendKeys("gouthami");
	  alt.accept();
	  
	/*  driver.switchTo().alert().sendKeys("gouthami");
	  driver.switchTo().alert().accept();*/
	  



  }
  @Test
 public void noalert() throws InterruptedException {
 driver.get("https://www.seleniumlearn.com/");
 Thread.sleep(3000);
 driver.switchTo().alert().accept();
 //we will get the console window NoAlertPresentException: no such alert
 
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
